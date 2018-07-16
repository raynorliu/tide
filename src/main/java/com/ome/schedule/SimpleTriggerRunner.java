package com.ome.schedule;

import java.util.Date;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleTrigger;
import org.quartz.impl.StdSchedulerFactory;



/**
 * 简单触发器
 * 
 * @author Raynor
 *
 */
public class SimpleTriggerRunner {

	public void task() throws SchedulerException {

		// 启动调度工厂
		StdSchedulerFactory schedulerFactory = new StdSchedulerFactory();

		// 从调度工厂检索调度程序
		Scheduler scheduler = schedulerFactory.getScheduler();

		// 当前时间
		long ctime = System.currentTimeMillis();

		// 启动JobDetail和作业名称，工作组，执行作业类
		JobDetail jobDetail = new JobDetail("jobDeatil-s1", "jobDetailGruop-s1", SimpleQuartzJob.class);

		// 使用其名称和组名称启动SimpleTrigger
		SimpleTrigger simpleTrigger = new SimpleTrigger("simpleTrigger", "triggerGroup-s1");

		// 设定启动时间
		simpleTrigger.setStartTime(new Date(ctime));

		// 设置间隔，作业运行的频率（此处为10秒）

		simpleTrigger.setRepeatInterval(10000);
		// 设置此作业的执行次数，设置为10次。
		// 它将运行10次并耗尽。
		simpleTrigger.setRepeatCount(100);

		// 设置此作业的结束时间。我们从启动时间开始设置为60秒
		// 即使我们将重复次数设置为10,这将在6次重复之后停止它的过程,因为它在那时它将结束。
		 simpleTrigger.setEndTime(new Date(ctime + 60000L));

		// 使用JobDetail和Trigger安排作业
		scheduler.scheduleJob(jobDetail, simpleTrigger);

		// 启动调度程序
		scheduler.start();
	}
	public static void main(String[] args) {
		SimpleTriggerRunner s =new SimpleTriggerRunner();
		try {
			s.task();
		} catch (SchedulerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
