package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	String cliente;
	List<Item> itens = new ArrayList<>();
	
	void adicionarItem(Item item) {
		itens.add(item);
		item.compra = this;
	}
	
	void adicionarItem(String nome, int quantidade, double preco) {
		this.adicionarItem(new Item(nome, quantidade, preco));
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for (Item item : itens) {
			total += item.quantidade*item.preco;
		}
		
		return total;
	}
}
