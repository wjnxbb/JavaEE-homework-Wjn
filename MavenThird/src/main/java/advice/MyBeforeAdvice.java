package advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
//����
public class MyBeforeAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] params, Object obj) throws Throwable {
		System.out.println("ǰ��֪ͨbefore����");
	}

}
