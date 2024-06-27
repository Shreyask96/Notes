package Springioc_both;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	
	void start()
	{
		System.out.println("engine started");
	}

}
