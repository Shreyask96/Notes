package Springioc_annotations;

import org.springframework.stereotype.Component;

@Component
public class Pipers implements Alcohol{

	@Override
	public void open() {
	System.out.println("Pipers bottle is opened");
		
	}

}
