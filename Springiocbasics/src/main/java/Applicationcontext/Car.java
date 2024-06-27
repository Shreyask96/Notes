package Applicationcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Car {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("iocappcontext.xml");
		Engine engine = (Engine) applicationContext.getBean("eng");
		engine.start();

	}

}
