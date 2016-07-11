package aop;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.springframework.aop.MethodBeforeAdvice;
public class LogAdviceBefore implements MethodBeforeAdvice{

	// ��ȡ��־��¼��
	private Logger logger = Logger.getLogger(LogAdviceBefore.class);
	
	public void before(Method method, Object[] args, Object target)
	{
		String targetClassName = target.getClass().getName();
		String targetMethodName = method.getName();
		
		String logInfoText = String.format("[ǰ��֪ͨ]��%s���%s������ʼִ��", targetClassName,targetMethodName);
		logger.info(logInfoText);
	}

}
