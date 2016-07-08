package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import biz.UserBizImpl;

public class TestSpringDI {

	public static void main(String args[])
	{
		// 加载beans配置
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("beans.xml");
		
		// 获取配置中的UserBizImpl实例
		UserBizImpl userBiz = (UserBizImpl) context.getBean("userBiz");
		boolean flag = userBiz.login("admin","123");
		if(flag){
			System.out.println("登陆成功");
		}else{
			System.out.println("登陆失败");
		}
		
	}

}
