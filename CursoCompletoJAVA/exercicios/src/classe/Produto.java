package classe;

public class Produto {
	
	String nome;
	double preco;
	double desconto;
	
	Produto(String nomeInicial){
		nome = nomeInicial;
	}
	
	Produto(){
		
	}
	
	Produto(String nomeInicial, double precoInicial, double descontoInicial){
		nome = nomeInicial;
		preco = precoInicial;
		desconto = descontoInicial;
	}
	
	double precoComDesconto() {
		double precoFinal = preco*(1-desconto);
		return precoFinal;
	}
	double precoComDesconto(double descontoGerente) {
		double precoFinal = preco*(1-desconto-descontoGerente);
		return precoFinal;
		
	}
	
}
