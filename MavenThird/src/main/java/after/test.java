package after;
//����֪ͨ������
@Test
public void test() {
	IStudentService studentService = (IStudentService) ac.getBean("afterProxy");
	studentService.saveStudent("����", 999);
}
