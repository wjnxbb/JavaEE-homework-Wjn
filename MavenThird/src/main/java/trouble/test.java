package trouble;

@Test
public void test() {
	IStudentService studentService = (IStudentService) ac.getBean("throwsProxy");
	studentService.delStudent(3); 
}
