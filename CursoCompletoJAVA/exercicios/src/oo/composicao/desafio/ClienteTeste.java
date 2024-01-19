package oo.composicao.desafio;

public class ClienteTeste {
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Matheus");

		Produto p1 = new Produto("Banana",1.29);
		Produto p2 = new Produto("Mamão", 10.49);
		Produto p3 = new Produto("Couve flor", 5.50);
		Produto p4 = new Produto("Brócolis", 9.99);
		
		
		ItemCarrinho i1 = new ItemCarrinho(p1,10);
		ItemCarrinho i2 = new ItemCarrinho(p2,5);
		ItemCarrinho i3 = new ItemCarrinho(p3,2);
		ItemCarrinho i4 = new ItemCarrinho(p4,7);
		
		
		
		
		
	}
}
