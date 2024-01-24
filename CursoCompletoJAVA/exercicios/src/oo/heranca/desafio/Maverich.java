package oo.heranca.desafio;

public class Maverich extends Carro{
	
	
	
	public Maverich() {
		super(220);
	}

	@Override
	int acelerar(Carro carro) {
		if(velocidade <= VELOCIDADE_MAXIMA) {
			carro.velocidade+=15;
		} else {
			velocidade = VELOCIDADE_MAXIMA;
		} 
		return velocidade;
	}
	
	@Override
	int frear(Carro carro) {
		if (velocidade >= 0 ) {
			carro.velocidade-= 10;
		} else {
			velocidade = 0;
		}
		return velocidade;
	}
}
