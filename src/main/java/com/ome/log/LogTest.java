package com.ome.log;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Logger;

public class LogTest {
	private Log log = LogFactory.getLog(this.getClass());

	private Logger logger = Logger.getLogger(LogTest.class);

	public void testLog() {
		log.debug("调试信息");
		log.info("一般信息");
		log.warn("警告信息");
		log.error("错误信息");
		log.fatal("严重错误信息");
	}

	public void testLogger() {
		logger.debug("调试信息");
		logger.info("一般信息");
		logger.warn("警告信息");
		logger.error("错误信息");
		logger.fatal("严重错误信息");
	}

	public static void main(String[] args) {
		LogTest l = new LogTest();
		l.testLog();
	}
}
