package Springioc_setter_di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeDriver {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("iocsetter.xml");
		
		Employee employee=(Employee) context.getBean("emp");
		System.out.println(employee);
		
//		Employee employee1=(Employee) context.getBean("emp1");
//		System.out.println(employee1);
		
	}

}
