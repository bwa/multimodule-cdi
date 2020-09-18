package no.bwa;

import javax.enterprise.context.ApplicationScoped;

//@Default
@ApplicationScoped
//@Alternative
public class InjectFromJAR implements SmokeTestable  {

	public String smokeTest() {
			return "Hello from InjectFromJAR";
	}


}
