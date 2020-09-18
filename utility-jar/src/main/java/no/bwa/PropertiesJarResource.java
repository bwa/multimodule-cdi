// tag::comment[]
/*******************************************************************************
 * Copyright (c) 2017, 2019 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
 // end::comment[]
package no.bwa;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Path("properties/jar")
public class PropertiesJarResource {

	@Inject 
	SmokeTestable smoketest; 

	@GET
    
	// invoke this with : http://localhost:9080/war-module/System/properties/jar
	
    public String getProperties() {
    	
		String s = "";
		
    	if(smoketest!=null) {
    		s = "PropertiesJarResource: smoketest="+smoketest.smokeTest();
    	} else {
        	s = "PropertiesJarResource: smoketest not here ...";
    	}
    	System.out.println(s);
    	
        return s;
    }

}
