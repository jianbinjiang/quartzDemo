package quartzDemo;

import java.util.Date;

import org.apache.log4j.Logger;
/**
 * 
 * @author jiangjianbin
 * @date 创建时间: 2016年2月15日 
 *   
 */
public class HelloWorld {

	private static Logger logger = Logger.getLogger(HelloWorld.class);

	public HelloWorld() {
		System.out.println("哈哈哈");
	}

	/**
	 * spring 检测要求不带参数
	 */
	public void execute() {
		logger.info("-----------------------------------------" + "\n\n你好你好你好! \n\n"
				+ "-----------------------------------------" + new Date());
	}
}
