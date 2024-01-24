package oo.heranca;

public class Jogador {
	
	int vida = 10;
	int posicaoX;
	int posicaoY;
	
	public Jogador(int posicaoX, int posicaoY) {
		super();
		this.posicaoX = posicaoX;
		this.posicaoY = posicaoY;
	}

	boolean atacar(Jogador oponente) {
		
		int deltaX = Math.abs(posicaoX - oponente.posicaoX);
		int deltaY = Math.abs(posicaoY- oponente.posicaoY);
		
		if((deltaX == 1 && deltaY == 0) || (deltaX == 0 && deltaY == 1)) {
			oponente.vida -= 1;
			return true;
		} else {
			return false;
		}
		
	}
	
	boolean andar(Direcao direcao) {
		switch(direcao) {
		case NORTE:
			posicaoY++;
			break;
		case SUL:
			posicaoY--;
			break;
		case LESTE: 
			posicaoX++;
			break;
		case OESTE: 
			posicaoX--;
			break;
		}
		return true;
		 
	}
}
