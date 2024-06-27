package Springioc_both;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	@Autowired
	Engine engine;
	
	void stop()
	{
		
		engine.start();
		System.out.println("stop the engine");
	}

}
