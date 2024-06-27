package Springioc_annotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Blenderspride  implements Alcohol{

	@Override
	public void open() {
		System.out.println("Blenderspride bottle is Opened");
		
	}

}
