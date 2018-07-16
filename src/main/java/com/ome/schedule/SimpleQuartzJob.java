package com.ome.schedule;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * 作业类
 * @author Raynor
 *
 */
public class SimpleQuartzJob implements Job {
	private static int i = 0;

	public SimpleQuartzJob() {

	}

	public void execute(JobExecutionContext context) throws JobExecutionException {
		i++;
		System.out.println(
				"In SimpleQuartzJob - executing it's Job at " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ").format(new Date()) + " by " + context.getTrigger().getName());
		
		System.out.println("已执行调度作业次数为  " + i + " 次，当前作业线程为 " + Thread.currentThread().getName() );
	}

}
