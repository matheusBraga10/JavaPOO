package oo.heranca.desafio;

public class Carro {
	final int VELOCIDADE_MAXIMA;
	int velocidade = 50;
	int delta = 5;
	
	
	public Carro(int VelocidadeMaxima) {
		super();
		VELOCIDADE_MAXIMA = VelocidadeMaxima;
	}

	int acelerar(Carro carro) {
		if(velocidade <= VELOCIDADE_MAXIMA) {
			carro.velocidade+=delta;
		} else {
			velocidade = VELOCIDADE_MAXIMA;
		} 
		return velocidade;
	}
	
	int frear(Carro carro) {
		if (velocidade >= 0 ) {
			carro.velocidade-= delta;
		} else {
			velocidade = 0;
		}
		return velocidade;
	}

	@Override
	public String toString() {
		return "Carro [velocidade=" + velocidade + "km/h]";
	}
	
	
}
