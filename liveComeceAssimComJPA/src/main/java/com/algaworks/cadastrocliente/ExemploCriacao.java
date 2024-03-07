package com.algaworks.cadastrocliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.algaworks.cadastrocliente.model.Cliente;

public class ExemploCriacao {
	
	public static void main(String[] args) {
		
		
		EntityManagerFactory entityManagerFactory = Persistence
				.createEntityManagerFactory("Cliente-PU");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Cliente cliente = new Cliente();
//		cliente.setId(2); Geração automática de id em Cliente.java
		cliente.setNome("Construtora Medeiros");

		
		entityManager.getTransaction().begin(); 	// Necessário para realizar commit (alterações no banco de dados)
		
		entityManager.persist(cliente); 			// Persiste a alteração para criação de novos dados no banco de dados
		
		entityManager.getTransaction().commit();	// Necessário para realizar commit (alterações no banco de dados)
		
		
		
		entityManager.close();
		entityManagerFactory.close();
	}
}

