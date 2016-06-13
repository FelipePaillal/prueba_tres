/**
 * 
 */
package cl.curso.java.prueba_tres.Fpaillal;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author Felipe Paillal
 *
 */
public class TarjetaBip {
	
	private int numeroDeTarjeta;
	private int saldo;
	private List<Viaje> viajes;
	
	
	
	public TarjetaBip() {
		// TODO Auto-generated constructor stub
	}

	public TarjetaBip(int numeroDeTarjeta, int saldo, List<Viaje> viajes) {
		super();
		this.numeroDeTarjeta = numeroDeTarjeta;
		this.saldo = saldo;
		this.viajes = viajes;
	}

	public int getNumeroDeTarjeta() {
		return numeroDeTarjeta;
	}

	public void setNumeroDeTarjeta(int numeroDeTarjeta) {
		this.numeroDeTarjeta = numeroDeTarjeta;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public List<Viaje> getViajes() {
		return viajes;
	}

	public void setViajes(List<Viaje> viajes) {
		this.viajes = viajes;
	}
	public void recargar (int monto){
		this.setSaldo(this.getSaldo()+ monto);
	}
	
	public void pagarViaje(int valorViaje){
		
		if (this.getSaldo()<valorViaje) {
			this.setSaldo(this.getSaldo()-valorViaje);
					
			
		} 
		throw new SinSaldoException("sin saldo");
		
		
			
	}
	public void imprimir(){
		
		System.out.println(this.getNumeroDeTarjeta());
		System.out.println(this.getSaldo());
		System.out.println(this.getViajes());
		Collections.sort(this.getViajes());
		for (Viaje viaje : viajes) {
			Iterator it = this.getViajes().iterator();
			while (it.hasNext()){
				System.out.println(it.next());
			}
			
		}
	}
	
	
	
	

}
