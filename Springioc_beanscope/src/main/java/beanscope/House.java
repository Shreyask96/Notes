package beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class House {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("iocbean.xml");
		
		Door d=(Door) context.getBean("door");
		d.open();
		
		Door d1=(Door) context.getBean("door");
		d1.open();
		
		Door d2=(Door) context.getBean("door");
		d2.close();
		
		Door d3=(Door) context.getBean("door");
		d3.close();
	}

}
