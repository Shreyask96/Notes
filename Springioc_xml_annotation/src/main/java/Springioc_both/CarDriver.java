package Springioc_both;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarDriver {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("ioc_annotation.xml");
		Car car = context.getBean(Car.class);
		car.engine.start();
		car.stop();

	}
}