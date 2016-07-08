package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import biz.UserBizImpl;

public class TestSpringDI {

	public static void main(String args[])
	{
		// ����beans����
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("beans.xml");
		
		// ��ȡ�����е�UserBizImplʵ��
		UserBizImpl userBiz = (UserBizImpl) context.getBean("userBiz");
		boolean flag = userBiz.login("admin","123");
		if(flag){
			System.out.println("��½�ɹ�");
		}else{
			System.out.println("��½ʧ��");
		}
		
	}

}
