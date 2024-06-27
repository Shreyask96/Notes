package Springioc_annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DrinkerDriver {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(Myconfig.class);
	    Drinkers drinkers=context.getBean(Drinkers.class);
	    drinkers.Nothigh();
	}

}
