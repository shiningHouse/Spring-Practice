package aop;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.springframework.aop.AfterReturningAdvice;

public class LogAdviceAfter implements AfterReturningAdvice{
	
	private Logger logger = Logger.getLogger(LogAdviceAfter.class);
	
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		
		String targetName = target.getClass().getName();
		String methodName = method.getName();
		String logInfoText = String.format("[后置通知]：%s类的%s方法完成", targetName,methodName);
		logger.info(logInfoText);
	}

}
