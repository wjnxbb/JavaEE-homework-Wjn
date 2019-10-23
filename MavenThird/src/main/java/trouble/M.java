package trouble;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;
//异常通知
public class MyThrowsAdvice implements ThrowsAdvice {

	public void afterThrowing(Method method, Object[] args, Object target, Exception ex) {
		System.out.println("在" + method + "方法上发生了：");
		System.out.println(ex.getMessage() + "异常");
		System.out.println("被代理的目标对象：" + target);
		System.out.println("参数列表为：");
		for (Object obj : args) {
			System.out.println(obj);
		}
	}
	
}
