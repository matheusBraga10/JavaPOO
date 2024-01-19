package oo.composicao.desafio;

public class ItemCarrinho {
	
	Produto produto;
	double total = 0;
	int quantidade;
	
	public ItemCarrinho(Produto produto, int quantidade) {
		super();
		this.produto = produto;
		this.quantidade = quantidade;
	}

	double totalCarrinho() {
	total = produto.preco*quantidade;
	return total;
	}
		
	
	
	
}
