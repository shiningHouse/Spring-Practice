package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import biz.UserBiz;

public class TestSpringDIByAnnotation {

	public static void main(String args[])
	{
		new TestSpringDIByAnnotation().springDIByAnotation();
	}

	public void springDIByAnotation()
	{
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("beans.xml");
		
		UserBiz userBiz = (UserBiz) context.getBean("userBizImplByAnnotation");
		boolean flag = userBiz.login("admin", "123");
		if(flag){
			System.out.println("µÇÂ¼³É¹¦");
		}else{
			System.out.println("µÇÂ¼Ê§°Ü");
		}
		
		
	}
}

