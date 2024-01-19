package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	List<ItemCarrinho> item = new ArrayList<>();
	Cliente cliente;
	
	public Compra(List<ItemCarrinho> item, Cliente cliente) {
		super();
		this.item = item;
		this.cliente = cliente;
	}
	
	double obterTotalCompra() {
		
	}
	
	
	
	
}
