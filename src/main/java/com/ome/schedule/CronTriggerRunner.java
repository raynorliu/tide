package com.ome.schedule;

import java.text.ParseException;
import java.util.Date;

import org.quartz.CronExpression;
import org.quartz.CronTrigger;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;

/**
 * Cron 触发器<br>
 * 相比simple触发器提供了更好的时间设置需求
 * @author Raynor
 *
 */
public class CronTriggerRunner {

	public void task() throws SchedulerException {
		// 启动调度工厂
		StdSchedulerFactory schedulerFactory = new StdSchedulerFactory();

		// 从调度工厂检索调度程序
		Scheduler scheduler = schedulerFactory.getScheduler();

		// 启动JobDetail和作业名称，工作组，执行作业类
		JobDetail jobDetail = new JobDetail("jobDeatil-s2", "jobDetailGruop-s2", SimpleQuartzJob.class);

		// 使用其名称和组名启动CronTrigger
		CronTrigger cronTrigger = new CronTrigger("cronTrigger", "triggerGroup2");

		try {
			// 设置cron表达式
			// CronExpression cexp = new CronExpression("0/5****?");
			CronExpression cexp = new CronExpression("0/5 * * * * ?");
			// 将CronExpression分配给CronTrigger
			cronTrigger.setCronExpression(cexp);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		// 使用JobDetail和Trigger安排作业
		scheduler.scheduleJob(jobDetail, cronTrigger);

		// 启动调度程序
		scheduler.start();
	}

	public static void main(String[] args) {
		CronTriggerRunner c = new CronTriggerRunner();
		try {
			c.task();
		} catch (SchedulerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
