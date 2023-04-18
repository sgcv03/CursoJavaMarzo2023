package ejerciciocuentas.clases;

public class Main {

	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta("Cuenta 1", "Sergio García");
		miCuenta.ingresar("Ingreso en cuenta", 10000);
		miCuenta.retirar("Retirada en cuenta", 3000);
		
		Debito tarjetaDebito = new Debito(miCuenta, "Tarjeta debito", "Sergio Garcia", null);
		tarjetaDebito.ingresar(1000);
		
		Credito tarjetaCredito = new Credito(miCuenta, "Tarjeta credito", "Sergio Garcia", null, 1000);
		tarjetaCredito.ingresar(6000);
		tarjetaCredito.retirar(2000);
		tarjetaCredito.liquidar(04, 2023);
		System.out.println(miCuenta.toString());
	}

}
