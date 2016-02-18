package org.home.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="pet_bread")
public class PetBreed implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_pet_bread")
	private Long id;
	
	@Column
	private String description;
	
	@Column(name="bread_code")
	private String code;

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="PET_BREAD_id_pet_bread")
	private List<Pet> pets;
	
	public PetBreed() {
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<Pet> getPets() {
		return pets;
	}

	public void setPets(List<Pet> pets) {
		this.pets = pets;
	}

	@Override
	public String toString() {
		return "PetBread [id=" + id + ", description=" + description + ", code=" + code + "]";
	}
	
	
}
