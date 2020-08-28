package co.edu.escuelaing.taller4.microString;

import co.edu.escuelaing.taller4.httpserver.HttpServer;

public class MicroSpringBoot {

	
	public static void main(String[] args) {
		/*args = new String[1];
		args[0] ="co.edu.escuelaing.taller4.microString.HelloController";*/ 
		try {
			MicroSpring iocServer = new MicroSpring();
			iocServer.start(args);
			HttpServer server = new HttpServer(iocServer);
			server.start();
		} catch (Exception e) {
			System.out.println("Fallo al iniciar el servidor");
		}
		
	}
}
