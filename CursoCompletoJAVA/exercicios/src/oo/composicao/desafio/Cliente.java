package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	String nome;
	List<Compra> compra = new ArrayList<>();
	
	
	public Cliente(String nome) {
		super();
		this.nome = nome;
	}
	
	
}
