package com.AgenciaTurismo;

public class Atendentes implements SalarioAtendentes{
	 private double salario;

	@Override
	public double salarioComisao(double valorVendas) {
		salario+= (valorVendas*0.1);
		return salario;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}


}
