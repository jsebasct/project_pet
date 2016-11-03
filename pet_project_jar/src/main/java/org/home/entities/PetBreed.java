package org.home.entities;

import java.io.Serializable;
import java.util.List;

public class PetBreed implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String description;

    private String code;

    private List<Pet> mascotas;

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

    public List<Pet> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<Pet> pets) {
        this.mascotas = pets;
    }

    @Override
    public String toString() {
        return "PetBread [id=" + id + ", description=" + description + ", code=" + code + "]";
    }

}
