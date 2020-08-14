package com.ParcelamentoCartao;

public class Parcelamento implements Quantidadeparcelas{
	private double valor ;
	private int parcelas;
	@Override
	public double calculaTaxa(double valor) {
		if(valor <= 100.0) {
			return 1;
		}else if(valor >100.0 && valor < 500.0) {
			return 2;
		}else if(valor >= 500.0 && valor <1000.0) {
			return 4;
		}else if(valor >= 1000.0) {
			return 10;
		}
		return 12;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getParcelas() {
		return parcelas;
	}
	public void setParcelas(int parcelas) {
		this.parcelas = parcelas;
	}
	
	
}
