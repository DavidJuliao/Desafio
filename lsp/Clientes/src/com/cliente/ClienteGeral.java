package com.cliente;


public class ClienteGeral {
	
	private String nome;
	private String cpf;
	private String cep;
	private double valorCompra;
	
	void notaFiscal() {
		System.out.println("____________________________________");
		System.out.println("| NOTA FISCAL:");
		System.out.println("| Nome:"+this.nome );
		System.out.println("| CPF:"+this.cpf );
		System.out.println("| CEP:"+this.cep );
		System.out.println("| Valor da compra :"+this.valorCompra );
		System.out.println("|____________________________________");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}
	

}
