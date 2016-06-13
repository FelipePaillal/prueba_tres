package cl.curso.java.prueba_tres.Fpaillal;

import java.util.ArrayList;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	Viaje viaje1 = new Viaje(new Date(), 10000, 5000);
    	Viaje viaje2 = new Viaje(new Date(), 20000, 5000);
    	Viaje viaje3 = new Viaje(new Date(), 20000, 5000);
    	ArrayList<Viaje> viajes = new ArrayList<Viaje>();
    	
    	viajes.add(viaje1);
    	viajes.add(viaje2);
    	viajes.add(viaje3);
    	
       TarjetaBip bip1 = new TarjetaBip(12233, 200000, viajes);
       
       bip1.imprimir();
       
       PagarViaje pagar = new PagarViaje(bip1, 1234);
       pagar.start();
    	
    	
    	
    }
}
