package after;
//后置通知测试类
@Test
public void test() {
	IStudentService studentService = (IStudentService) ac.getBean("afterProxy");
	studentService.saveStudent("姓名", 999);
}
