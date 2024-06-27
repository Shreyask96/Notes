package Springioc_setter_di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PatientDriver {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("patsetterioc.xml");
		Patient patient=(Patient) context.getBean("pat");
		System.out.println(patient);
		
		Patient patient1=(Patient) context.getBean("pat1");
		System.out.println(patient1);
		
	}

}
