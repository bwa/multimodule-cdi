# multimodule-cdi
Demo project to find a possible CDI issue


NB! This project uses WebSphere Liberty, as the final application target is WAS 8.5.5

You might need to point to IBM repository i the pom.xml


# To test

execute ``mvn install`` in the multimodule-cdi folder
then execute ``mvn liberty:dev`` in the war-module folder

put these url into your browser

This will load the resource from WAS module
[http://localhost.klp.no:9080/war-module/System/properties/war](http://localhost.klp.no:9080/war-module/System/properties/war)

This will load the resource from JAR module
[http://localhost.klp.no:9080/war-module/System/properties/jar](http://localhost.klp.no:9080/war-module/System/properties/jar)

It will show that both resources are OK. 

But the CDI seems to not find the InjectFromJAR class, onlu the InjectFromWAR class.

# The final goal
The final goal is to be able to use the InjectFromJAR in the PropertiesJarResource and be able to use the InjectFromWAR as an alternative.


The SmokeTest in utility-jar is a common jar module that only needs to be put into the WAR projects dependency, and it will run out-of-the-box. Then if you desire you can create a custom smoketest in each WAR project and use that instead of the default one form the common jar.



