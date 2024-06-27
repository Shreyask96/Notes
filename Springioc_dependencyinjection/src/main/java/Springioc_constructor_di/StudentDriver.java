package Springioc_constructor_di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDriver {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("stuidentioc.xml");
		Student student=(Student) context.getBean("stu");
		System.out.println(student);
	}

}
