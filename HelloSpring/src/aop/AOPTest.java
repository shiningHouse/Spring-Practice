package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import biz.UserBiz;

public class AOPTest {

	public static void main(String args[]){
		ApplicationContext context =
				new ClassPathXmlApplicationContext("beans.xml");
		
		UserBiz userBiz = (UserBiz)context.getBean("logProxy");
		userBiz.addUser("Mike", "123456");
		userBiz.deleteUser(3);
	}

}
