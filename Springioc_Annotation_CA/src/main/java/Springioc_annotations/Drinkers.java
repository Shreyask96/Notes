package Springioc_annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Drinkers {
	
	@Autowired
	Alcohol alcohol;
	
	void Nothigh()
	{
		alcohol.open();
		System.out.println("Party is onn");
	}
	

}
