package rest;

import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/rest")
public class RestApplication extends Application {
	
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> resources = new java.util.HashSet<>();
		addRestResourceClasses(resources);
		
		return resources;
	}
	
	public void addRestResourceClasses(Set<Class<?>> resources) {
		resources.add(RestInvoke.class);
		resources.add(RestLike.class);
		
	}

}
