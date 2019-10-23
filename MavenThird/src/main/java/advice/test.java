package advice;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.service.IStudentService;
//ǰ��֪ͨ������
public class test {
	
	private ClassPathXmlApplicationContext ac = null;
	
	@Before
	public void init() {
		ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	@Test
	public void testMyBeforeAdvice() {
		IStudentService studentService = (IStudentService) ac.getBean("beforeProxy");
		studentService.saveStudent();
	}
}
