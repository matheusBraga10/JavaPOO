package com.algaworks.sistemacursos;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.algaworks.sistemacursos.model.Curso;
import com.algaworks.sistemacursos.model.Modulo;

public class Relacionamentos {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence
                .createEntityManagerFactory("Cursos-PU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Curso curso = new Curso();
        curso.setNome("Especialista JPA");

        Modulo modulo = new Modulo();
        modulo.setNome("Introdução ao JPA");
        modulo.setCurso(curso);

        curso.setModulos(Arrays.asList(modulo));

        entityManager.getTransaction().begin();

        entityManager.persist(curso);
        entityManager.persist(modulo);

        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}