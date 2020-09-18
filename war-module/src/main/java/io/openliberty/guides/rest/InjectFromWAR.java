package io.openliberty.guides.rest;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;

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
