package co.edu.escuelaing.taller4.microString;

public class HelloController {

	@RequestMapping("/saludar")
	public static String saludar() {
		return "Greeting from micro spring boot!";
	}
	
	@RequestMapping("/despedir")
	public static String despedir() {
		return "bye bye!";
	}
	
}
