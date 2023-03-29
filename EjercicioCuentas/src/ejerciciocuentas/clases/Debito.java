package ejerciciocuentas.clases;

import java.time.LocalDate;

public class Debito extends Tarjeta{

	public Debito(Cuenta cuentaAsociada,String numeroTarjeta, String titularTarjeta, LocalDate fechaCaducidad) {
		super(cuentaAsociada, numeroTarjeta, titularTarjeta, fechaCaducidad);
	}

	@Override
	public double getSaldo() {
		return getCuentaAsociada().getSaldo();
	}

	@Override
	public void ingresar(double x) {
		getCuentaAsociada().ingresar("Ingresar con tarjeta", x);
	}

	@Override
	public void pagoEnEstablecimiento(String datos, double x) {
		System.out.println("Compras en: " + datos + ", "+ x);
	}

	@Override
	public void retirar(double x) {
		getCuentaAsociada().retirar("Retirada con tarjeta", -x);
	}

}
