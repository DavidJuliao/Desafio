package com.cliente;

public class ClientePlus extends ClienteGeral{
	double cashback = (this.getValorCompra()) * 0.10;
	
	void notaFiscal() {
		
		System.out.println("____________________________________");
		System.out.println("| NOTA FISCAL:");
		System.out.println("| Nome:"+this.getNome() );
		System.out.println("| CPF:"+this.getCpf() );
		System.out.println("| CEP:"+this.getCep() );
		System.out.println("| Valor da compra :"+this.getValorCompra() );
		System.out.println("| Cashback: "+this.cashback);
		System.out.println("|____________________________________");
		
	}
	
	
	}

