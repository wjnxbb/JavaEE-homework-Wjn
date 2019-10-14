
public class Test {
	@Test
	public void MavenSecondTest(){
    	ApplicationContext context = new ClassPathXmlApplicationContext(
    			new String[]{"applicationContext.xml"}
    			);
    	Metting[] m = new Metting[2];
    	m[0] = (Metting) context.getBean("m1");
    	m[1] = (Metting) context.getBean("m2");
    	ToMettingDao tm;
    	tm.todo(m);
    	
    }

}
