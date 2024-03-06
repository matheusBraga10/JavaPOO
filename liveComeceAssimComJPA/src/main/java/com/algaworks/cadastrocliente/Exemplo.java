package com.algaworks.cadastrocliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.algaworks.cadastrocliente.model.Cliente;

public class Exemplo {
	
	public static void main(String[] args) {
		
		
		EntityManagerFactory entityManagerFactory = Persistence
				.createEntityManagerFactory("Cliente-PU");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Cliente cliente = entityManager.find(Cliente.class, 1);
		System.out.println(cliente.getNome());		
		
		entityManager.close();
		entityManagerFactory.close();
	}
}

