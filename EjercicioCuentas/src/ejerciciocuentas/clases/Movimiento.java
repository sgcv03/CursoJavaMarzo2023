package ejerciciocuentas.clases;

import java.time.LocalDate;

public class Movimiento {
	
	private String concepto;
	private LocalDate fecha;
	private double importe;
	
	public Movimiento() {
		fecha = LocalDate.now();
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String newConcepto) {
		this.concepto = newConcepto;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate newFecha) {
		this.fecha = newFecha;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double newImporte) {
		this.importe = newImporte;
	}

	@Override
	public String toString() {
		return "Concepto: "+concepto + ", fecha= " + fecha + ", importe= " + importe + "\n";
	}

	
	
	
	
	
	
}
