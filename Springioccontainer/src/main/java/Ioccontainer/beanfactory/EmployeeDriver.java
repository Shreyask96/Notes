package Ioccontainer.beanfactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class EmployeeDriver {

	public static void main(String[] args) {
		
		
//		ClassPathResource resource=new ClassPathResource("iocbeanfactory.xml");  //finding xml file
//		BeanFactory beanFactory=new XmlBeanFactory(resource);                    //loading xml file to container
//		Employee e=(Employee) beanFactory.getBean("emp");
//		Employee e1=(Employee) beanFactory.getBean("emp");
//		System.out.println(e==e1);
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("iocbeanfactory.xml");
		applicationContext.getBean("emp");
		
	}
}
