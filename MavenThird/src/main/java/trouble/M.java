package trouble;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;
//�쳣֪ͨ
public class MyThrowsAdvice implements ThrowsAdvice {

	public void afterThrowing(Method method, Object[] args, Object target, Exception ex) {
		System.out.println("��" + method + "�����Ϸ����ˣ�");
		System.out.println(ex.getMessage() + "�쳣");
		System.out.println("�������Ŀ�����" + target);
		System.out.println("�����б�Ϊ��");
		for (Object obj : args) {
			System.out.println(obj);
		}
	}
	
}
