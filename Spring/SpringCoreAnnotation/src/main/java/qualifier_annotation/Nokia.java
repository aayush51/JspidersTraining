package qualifier_annotation;

import org.springframework.stereotype.Component;

@Component
public class Nokia implements Mobile {

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("Calling from Nokia");
	}

}
