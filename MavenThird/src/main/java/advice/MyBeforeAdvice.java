package advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
//切面
public class MyBeforeAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] params, Object obj) throws Throwable {
		System.out.println("前置通知before方法");
	}

}
