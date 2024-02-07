package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa"); //cria o EntityManager
		EntityManager em = emf.createEntityManager(); // responsável por fazer crud
		
		Usuario novoUsuario = new Usuario("Djalma", "djalma@lanche.com.br");
		
		novoUsuario.setId(1L);
		em.persist(novoUsuario);
		
		
		em.close();
		emf.close();
	}
}
