package com.rf.ejercicios;

public class Intercambio<T> {
	
	private T elemento1;
	private T elemento2;
	
	public Intercambio() {
		super();
	}

	public void invierte() {
		elemento1 = getElemento2();
		elemento2 = getElemento1();
	}

	public T getElemento1() {
		return elemento1;
	}

	public void setElemento1(T elemento1) {
		this.elemento1 = elemento1;
	}

	public T getElemento2() {
		return elemento2;
	}

	public void setElemento2(T elemento2) {
		this.elemento2 = elemento2;
	}

	@Override
	public String toString() {
		return "Intercambio [elemento1=" + getElemento1() + ", elemento2=" + getElemento2() + "]";
	}
	
	

}
