package no.bwa.cdi;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import no.klp.SmokeTestable;

@Path("properties/war")
public class PropertiesWarResource {

	@Inject 
	SmokeTestable smoketest; 

	@GET
	
	// invoke this with : http://localhost:9080/war-module/System/properties/war
	
    public String getProperties() {
    	
		String s = "";
		
    	if(smoketest!=null) {
    		s = "PropertiesWarResource: smoketest="+smoketest.smokeTest();
    	} else {
        	s = "PropertiesWarResource: smoketest not here ...";
    	}
    	System.out.println(s);
    	
        return s;
    }

}
