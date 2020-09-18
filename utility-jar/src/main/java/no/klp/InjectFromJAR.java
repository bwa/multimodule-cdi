package no.klp;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Default;

//@Default
@ApplicationScoped
//@Alternative
public class InjectFromJAR implements SmokeTestable  {

	public String smokeTest() {
			return "Hello from InjectFromJAR";
	}


}
