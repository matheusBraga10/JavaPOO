package oo.heranca.desafio;

public class Carro {
	protected final int VELOCIDADE_MAXIMA;
	protected int velocidade = 50;
	protected int delta = 5;
	
	
	protected Carro(int VelocidadeMaxima) {
		super();
		VELOCIDADE_MAXIMA = VelocidadeMaxima;
	}

	public int acelerar(Carro carro) {
		if(velocidade <= VELOCIDADE_MAXIMA) {
			carro.velocidade+=delta;
		} else {
			velocidade = VELOCIDADE_MAXIMA;
		} 
		return velocidade;
	}
	
	public int frear(Carro carro) {
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
