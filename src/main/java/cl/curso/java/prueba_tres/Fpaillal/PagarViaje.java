/**
 * 
 */
package cl.curso.java.prueba_tres.Fpaillal;

/**
 * @author gonza
 *
 */
public class PagarViaje extends Thread {
	
	private TarjetaBip tarjetaBip;
	private int valorViaje;
	
	public PagarViaje() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public PagarViaje(TarjetaBip tarjetaBip, int valorViaje) {
		super();
		this.tarjetaBip = tarjetaBip;
		this.valorViaje = valorViaje;
	}
	
	



	public TarjetaBip getTarjetaBip() {
		return tarjetaBip;
	}



	public void setTarjetaBip(TarjetaBip tarjetaBip) {
		this.tarjetaBip = tarjetaBip;
	}



	public int getValorViaje() {
		return valorViaje;
	}



	public void setValorViaje(int valorViaje) {
		this.valorViaje = valorViaje;
	}



	@Override
	public void run() {
		this.getTarjetaBip().pagarViaje(this.getValorViaje());
	}

}
