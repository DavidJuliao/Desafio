package com.ParcelamentoCartao;

public class App {

	public static void main(String[] args) {
		Parcelamento  meuParcelamento = new Parcelamento();
		
		System.out.println(meuParcelamento.calculaTaxa(100.0));
		System.out.println(meuParcelamento.calculaTaxa(250.0));
		System.out.println(meuParcelamento.calculaTaxa(980.0));
		System.out.println(meuParcelamento.calculaTaxa(1023.0));


	}

}
