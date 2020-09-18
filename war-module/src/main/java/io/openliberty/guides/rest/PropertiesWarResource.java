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
package io.openliberty.guides.rest;

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
