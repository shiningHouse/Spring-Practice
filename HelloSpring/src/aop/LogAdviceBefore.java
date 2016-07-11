package aop;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.springframework.aop.MethodBeforeAdvice;
public class LogAdviceBefore implements MethodBeforeAdvice{

	// 获取日志记录器
	private Logger logger = Logger.getLogger(LogAdviceBefore.class);
	
	public void before(Method method, Object[] args, Object target)
	{
		String targetClassName = target.getClass().getName();
		String targetMethodName = method.getName();
		
		String logInfoText = String.format("[前置通知]：%s类的%s方法开始执行", targetClassName,targetMethodName);
		logger.info(logInfoText);
	}

}
