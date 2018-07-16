package com.ome.schedule;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleTrigger;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;

/**
 * 可数据持久化的触发器
 * 
 * @author Raynor
 *
 */
public class JDBCJobStoreRunner {

	public void task() throws SchedulerException {
		// 启动调度工厂
		StdSchedulerFactory schedulerFactory = new StdSchedulerFactory();

		// 从调度工厂检索调度程序
		Scheduler scheduler = schedulerFactory.getScheduler();

		String[] triggerGroups;
		String[] triggers;

		triggerGroups = scheduler.getTriggerGroupNames();
		for (int i = 0; i < triggerGroups.length; i++) {
			triggers = scheduler.getTriggerNames(triggerGroups[i]);
			for (int j = 0; j < triggers.length; j++) {
				Trigger tg = scheduler.getTrigger(triggers[j], triggerGroups[i]);
				if (tg instanceof SimpleTrigger && tg.getName().equals("simpleTrigger")) {
					((SimpleTrigger) tg).setRepeatCount(100);

					// 重新安排工作
					scheduler.rescheduleJob(triggers[j], triggerGroups[i], tg);

					// 不安排工作
					// scheduler.unscheduleJob(triggers[j], triggerGroups[i]);
				}
			}
		}

		// 启动调度程序
		scheduler.start();
	}
	
	public static void main(String[] args) {
		JDBCJobStoreRunner j = new JDBCJobStoreRunner();
		try {
			j.task();
		} catch (SchedulerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
