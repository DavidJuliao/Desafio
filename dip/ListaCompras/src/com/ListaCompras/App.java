package com.ListaCompras;

public class App {
	public static void main(String args[]) {
		Lista minhaLista = new Lista();
		minhaLista.inserirProduto("verdura");
		minhaLista.inserirProduto("frutas");
		minhaLista.inserirProduto("carne");
		minhaLista.inserirProduto("refrigerante");		
		
		minhaLista.apagarProduto("verdura");
		
		System.out.println("a lista contem"+minhaLista.getListaCompras());
		
	}
	

}
