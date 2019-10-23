package after;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
//∫Û÷√Õ®÷™
public class MyAfterAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("Object returnValue:" + returnValue); 
		System.out.println("Method method:" + method); 
		System.out.println("Object[] args:"); 
		for (Object obj : args) {
			System.out.println(obj);
		}
		System.out.println("Object target:" + target);
	}

}
