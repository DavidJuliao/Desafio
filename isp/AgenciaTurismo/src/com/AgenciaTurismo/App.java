package com.AgenciaTurismo;

public class App {
	public static void main(String args[]) {
		
		Vendedores salarioVendedores = new Vendedores();
		Atendentes salarioAtendentes = new Atendentes();
		
		salarioAtendentes.setSalario(1000);
		System.out.println(salarioAtendentes.salarioComisao(5000.0));
		
		System.out.println(salarioVendedores.comissao(5000.0));
		
		
		
		
	}
}
