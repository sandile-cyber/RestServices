package za.co.shongs;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/res")
public class ClientApplication extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		// TODO Auto-generated method stub
		Set<Class<?>> classes = new HashSet<Class<?>>();
		classes.add(ClientAPI.class);
		
		return classes;
	}

}
