package org.home.entities;

import java.io.Serializable;
import java.util.List;

public class Colour implements Serializable {
	
	private static final long serialVersionUID = 1L;
        
	private Long id;
	private String desc;

	private List<Pet> mascotas;	
	
	public Colour() {
		
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public List<Pet> getMascotas() {
		return mascotas;
	}

	public void setMascotas(List<Pet> mascotas) {
		this.mascotas = mascotas;
	}
}
