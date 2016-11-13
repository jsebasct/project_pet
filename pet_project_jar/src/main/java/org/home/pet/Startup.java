package org.home.pet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.home.model.entities.Pet;

public class Startup {

	public static void main(String[] args) {
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PetPU");
		
		EntityManager entityManager = emf.createEntityManager();
		entityManager.getTransaction().begin();
		
		Pet aPet = new Pet();
		aPet.setName("Cachuchin");
		
		entityManager.persist(aPet);
		
		entityManager.getTransaction().commit();
		entityManager.close();
		
		
	}

}
