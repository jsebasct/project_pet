package org.home.model.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Lost {

	@Id
	@GeneratedValue
	@Column(name="lost_id")
	private Long id;
	
	@Column
	private Date lostDate;
	
	@Column
	private Date publishDate;
	
	@Column
	private String description;
	
	@Column
	private String country;
	
	@Column
	private String zone;
	
	@ManyToOne
	@JoinColumn(name="pet_id", foreignKey=@ForeignKey(name="pet_id_fk"))
	private Pet lostPet;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public Date getLostDate() {
		return lostDate;
	}

	public void setLostDate(Date lostDate) {
		this.lostDate = lostDate;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Pet getLostPet() {
		return lostPet;
	}

	public void setLostPet(Pet lostPet) {
		this.lostPet = lostPet;
	}

	
	
}
