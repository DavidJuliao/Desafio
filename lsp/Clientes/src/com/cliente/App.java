package com.cliente;

public class App {

	public static void main(String[] args) {
		ClientePlus clientePlus = new ClientePlus();
		clientePlus.setNome("Daniel");
		clientePlus.setCpf("123.456.789-01");
		clientePlus.setCep("60871-055") ;
		clientePlus.setValorCompra(100.25)  ;
		clientePlus.cashback = (int) (clientePlus.getValorCompra() *(Double)0.10);
		
		clientePlus.notaFiscal();
		

	}

}
