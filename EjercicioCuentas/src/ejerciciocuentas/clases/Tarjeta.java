package ejerciciocuentas.clases;

import java.time.LocalDate;

public abstract class Tarjeta {
	
	private Cuenta cuentaAsociada;
	private LocalDate fechaDeCaducidad;
	private String numero;
	private String titular;
	
	public Tarjeta(Cuenta cuentaAsociada ,String numero, String titular, LocalDate fechaCaducidad) {
		this.cuentaAsociada = cuentaAsociada;
		this.fechaDeCaducidad = fechaCaducidad;
		this.numero = numero;
		this.titular = titular;
	}
	
	public abstract double getSaldo();
	public abstract void ingresar(double x);
	public abstract void pagoEnEstablecimiento(String datos, double x);
	public abstract void retirar(double x);
	
	public void setCuenta(Cuenta c) {
		this.cuentaAsociada = c;
	}
	
	public Cuenta getCuentaAsociada() {
		return cuentaAsociada;
	}

	public void setCuentaAsociada(Cuenta cuentaAsociada) {
		this.cuentaAsociada = cuentaAsociada;
	}

	public LocalDate getFechaDeCaducidad() {
		return fechaDeCaducidad;
	}

	public void setFechaDeCaducidad(LocalDate fechaDeCaducidad) {
		this.fechaDeCaducidad = fechaDeCaducidad;
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

	@Override
	public String toString() {
		return "Entidad empleada --> " + getNumero() + ", titular --> " + getTitular() + ", saldo cuenta --> " + getSaldo() + 
				", movimientos asociados --> \n" + getCuentaAsociada().getMovimientos();
	}
	
}
