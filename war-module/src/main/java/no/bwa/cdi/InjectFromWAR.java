package no.bwa.cdi;

import no.klp.SmokeTestable;

//@Alternative
//@ApplicationScoped
public class InjectFromWAR 
implements SmokeTestable  
{

		@Override
		public String smokeTest() {
			return "Hello from InjectFromWAR";
			
		}
		


}
