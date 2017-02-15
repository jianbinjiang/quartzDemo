package quartzDemo;

import org.apache.log4j.Logger;

/**
 * 
 * @author jiangjianbin
 * @date 创建时间: 2016年2月15日 
 *
 */
public class Log4jDemo {
	Logger logger = Logger.getLogger(Log4jDemo.class);
	public Log4jDemo() {
		logger.warn("yes yes 1111111");
	}
	public static void main(String[] args) {
		//PropertyConfigurator.configure("log4j.properties");
		Log4jDemo l = new Log4jDemo();
		System.out.println(l);
	}
}
