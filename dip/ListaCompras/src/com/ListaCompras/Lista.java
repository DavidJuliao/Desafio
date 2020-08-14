package com.ListaCompras;

import java.util.ArrayList;

public class Lista implements Gerenciador {
	
	 private ArrayList<String> listaCompras= new ArrayList<String>();

	@Override
	public void inserirProduto(String produto) {
		listaCompras.add(produto);
		System.out.println(produto+" adicionado");
		
	}

	@Override
	public void apagarProduto(String produto) {
		listaCompras.remove(produto);
		System.out.println(produto+" apagado");
		
	}
	
	public ArrayList<String> getListaCompras(){
		return listaCompras;
		
		}
	
	
}
