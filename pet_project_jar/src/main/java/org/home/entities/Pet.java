package org.home.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

//@Entity
public class Pet implements Serializable {
	
	private static final long serialVersionUID = -7482911561529410314L;

//	@Id
//	@Column(name="id_pet")
	private Long id;
	
//	@Column(name="pet_name")
	private String name;
	
//	@ManyToOne
//	@JoinColumn(name="PET_BREAD_id_pet_bread")
	private PetBreed breedPet;

	public Pet() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PetBreed getBreedPet() {
		return breedPet;
	}

	//breedPet
	public void setBreedPet(PetBreed breed) {
		this.breedPet = breed;
	}
	
}
