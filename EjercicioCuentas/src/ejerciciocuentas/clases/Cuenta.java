package ejerciciocuentas.clases;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {

	private List<Movimiento> movimientos;
	private String numero;
	private String titular;
	
	public Cuenta(String numero, String titular) {
		movimientos = new ArrayList<Movimiento>();
		this.numero = numero;
		this.titular = titular;
	}

	public void addMovimiento(Movimiento m) {
		movimientos.add(m);
	}
	
	public double getSaldo() {
		double saldoFinal = 0;
		for (int i = 0; i < movimientos.size();i++) {
			saldoFinal += movimientos.get(i).getImporte();
			
		}
		return saldoFinal;
	}
	
	
	public void ingresar(double x) {
		Movimiento movimiento = new Movimiento();
		movimiento.setImporte(x);
		addMovimiento(movimiento);
	}
	
	public void ingresar(String concepto, double x) {
		Movimiento movimiento = new Movimiento();
		movimiento.setConcepto(concepto);
		movimiento.setImporte(x);
		addMovimiento(movimiento);
	}
	
	public void retirar(double x) {
		Movimiento movimiento = new Movimiento();
		movimiento.setImporte(-x);
		addMovimiento(movimiento);
		
	}
	
	public void retirar(String concepto, double x) {
		Movimiento movimiento = new Movimiento();
		movimiento.setConcepto(concepto);
		movimiento.setImporte(-x);
		addMovimiento(movimiento);
	}

	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public List<Movimiento> getMovimientos() {
		return movimientos;
	}

	@Override
	public String toString() {
		return "Numero de cuenta --> " + getNumero() + ", titular --> "+ getTitular() + ", saldo cuenta --> " + getSaldo() +
			", movimientos asociados --> \n" + getMovimientos().toString();
	}
		
}
