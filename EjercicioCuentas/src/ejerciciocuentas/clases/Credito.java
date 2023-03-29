package ejerciciocuentas.clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Credito extends Tarjeta{

	private double credito;
	private List<Movimiento> movimientos;
	
	public Credito(Cuenta cuentaAsociada,String numeroTarjeta, String titularTarjeta, LocalDate fechaCaducidad, double credito) {
		super(cuentaAsociada, numeroTarjeta, titularTarjeta, fechaCaducidad);
		this.credito = credito;
		this.movimientos = new ArrayList<Movimiento>();
	}

	public double getCreditoDisponible() {
		return credito + getSaldo();
	}

	@Override
	public double getSaldo() {
		return getCuentaAsociada().getSaldo();
	}

	@Override
	public void ingresar(double x) {
		Movimiento movimiento = new Movimiento();
		movimiento.setConcepto("Ingreso en cuenta asociada (cajero automatico)");
		movimiento.setImporte(x);
		movimientos.add(movimiento);
	}

	@Override
	public void pagoEnEstablecimiento(String datos, double x) {
		Movimiento movimiento = new Movimiento();
		movimiento.setConcepto("Compra en -> " + datos);
		movimiento.setImporte(x);
		movimientos.add(movimiento);
	}

	public void liquidar(int mes, int year) {
		Movimiento liquidez = new Movimiento();
		liquidez.setConcepto("Liquidacion de operaciones tarjeta de credito " + mes + " del " + year);
		
		double total = 0;
		
		for(int i = this.movimientos.size()-1; i >= 0; i--) {
			Movimiento mov = movimientos.get(i);
			
			if(mov.getFecha().getMonthValue() == mes && mov.getFecha().getYear() == year) {
				total += mov.getImporte();
				movimientos.remove(mov);
			}
		}
		liquidez.setImporte(total);
		getCuentaAsociada().addMovimiento(liquidez);
	}
	
	@Override
	public void retirar(double x) {
		Movimiento movimiento = new Movimiento();
		
		if(getSaldo() > 0) {
			movimiento.setConcepto("Retiro en cuenta asociada (cajero automatico)");
			movimiento.setImporte(-x);
			movimientos.add(movimiento);
		}else {
			System.err.println("Saldo en cuenta insuficiente");
		}
		
	}
	
}
