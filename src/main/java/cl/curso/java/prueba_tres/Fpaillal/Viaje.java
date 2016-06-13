/**
 * 
 */
package cl.curso.java.prueba_tres.Fpaillal;

import java.util.Collection;
import java.util.Collections;
import java.util.Date;

/**
 * @author Felipe paillal
 *
 */
public class Viaje implements Comparable<Viaje> {
	
	private Date fecha;
	private int saldoTarjeta;
	private int valorViaje;
	
	public Viaje() {
		// TODO Auto-generated constructor stub
	}

	public Viaje(Date fecha, int saldoTarjeta, int valorViaje) {
		super();
		this.fecha = fecha;
		this.saldoTarjeta = saldoTarjeta;
		this.valorViaje = valorViaje;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getSaldoTarjeta() {
		return saldoTarjeta;
	}

	public void setSaldoTarjeta(int saldoTarjeta) {
		this.saldoTarjeta = saldoTarjeta;
	}

	public int getValorViaje() {
		return valorViaje;
	}

	public void setValorViaje(int valorViaje) {
		this.valorViaje = valorViaje;
	}

	public int compareTo(Viaje o) {
		// TODO Auto-generated method stub
		return this.getFecha().compareTo(getFecha());
	}

	@Override
	public String toString() {
		return "Viaje [fecha=" + fecha + ", saldoTarjeta=" + saldoTarjeta + ", valorViaje=" + valorViaje + "]";
	}


	
	
	

}
