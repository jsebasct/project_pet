package org.home.pet;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.home.model.entities.Lost;
import org.home.model.entities.Pet;

public class Startup {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PetPU");
		
		EntityManager entityManager = emf.createEntityManager();
		entityManager.getTransaction().begin();
		
		Pet aPet = new Pet();
		aPet.setName("YoYo");
		aPet.setGender("Hembra");
		aPet.setSize("Mediano");
		aPet.setColour("Negro-Gris");;
		
		Lost lost = new Lost();
		lost.setLostPet(aPet);
		lost.setPublishDate(new Date());
		lost.setLostDate(new Date());
		lost.setCountry("Argentina");
		lost.setZone("Villa Del Parque");
		lost.setDescription("Se perdió HASH, pitbull macho muy dócil y bueno, el día sábado 12/11 por la noche. Se lo vio por última vez en Av. Marquez y Panamericana.");
		
		entityManager.persist(aPet);
		entityManager.persist(lost);
		
		entityManager.getTransaction().commit();
		entityManager.close();
		
		
	}

}
