package dci.ufro.cl.fifa;

import dci.ufro.cl.fifa.controladorArchivo.ManejoArchivo;
import dci.ufro.cl.fifa.model.Jugador;
import dci.ufro.cl.fifa.model.ListaJugador;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class FifaApplication {

	public static void main(String[] args) {

		ListaJugador.agregarJugadores();
		SpringApplication.run(FifaApplication.class, args);
		/*ManejoArchivo ma = new ManejoArchivo();
		String jg = ma.leerArchivo("data.csv");
		for (int i=0; i<5925;i++){ //sólo puede mostrar de manera ordenada hasta ésta cantidad (5925) de jugadores por consola.
			System.out.println(jg.get(i).toString());
		}*/
	}

}
