package org.home.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Pet implements Serializable {

	private static final long serialVersionUID = -7482911561529410314L;

	private Long id;

	private String name;

	private PetBreed breedPet;

	private List<Colour> colores;
	
	public Pet() {
		colores = new ArrayList<Colour>();
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

	// breedPet
	public void setBreedPet(PetBreed breed) {
		this.breedPet = breed;
	}

	public List<Colour> getColores() {
		return colores;
	}

	public void setColores(List<Colour> colores) {
		this.colores = colores;
	}
	
	public void addColor(Colour newColor) {
		this.colores.add(newColor);
	}

}
