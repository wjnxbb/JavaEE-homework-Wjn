package com.itheima.ioc;
import org.*;
public class TestIoc {
	public static void main(String[] args){
		ApplicationContext apl = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
}
