package com.AgenciaTurismo;

public class Vendedores implements SalarioVendedores{
	double salario;
	@Override
	public double comissao(double valorVendas) {
		salario += (valorVendas*0.2);
		return salario;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}



}
