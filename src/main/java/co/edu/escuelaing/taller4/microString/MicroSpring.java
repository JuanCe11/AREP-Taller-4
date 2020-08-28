package co.edu.escuelaing.taller4.microString;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class MicroSpring {
	private static Map<String,Method> beans;
	
	public void start(String[] args) throws Exception {
		int mapped = 0;
		
		beans = new HashMap<String, Method>();
		for (Method m : Class.forName(args[0]).getDeclaredMethods()) {
			if(m.isAnnotationPresent(RequestMapping.class)) {
				try {
					RequestMapping rm = m.getAnnotation(RequestMapping.class);
					System.out.println("validando /"+rm.value());
					beans.put(rm.value(),m);
					mapped++;
				}catch(Throwable ex) {
					ex.printStackTrace();
					System.out.println("Fallo");
				}
			}
		}
		System.out.printf("Mapeados %d",mapped);
	}
	
	public String invoke(String path) {
		try {
			return beans.get(path).invoke(null).toString();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return "Error";
	}
	
}