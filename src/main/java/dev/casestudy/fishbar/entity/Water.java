package dev.casestudy.fishbar.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Water {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private String clarity;
	@ManyToMany
	private List<Fish> fish;
	
	public Water() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Water(Long id, String name, String clarity) {
		super();
		this.id = id;
		this.name = name;
		this.clarity = clarity;
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

	public String getClarity() {
		return clarity;
	}

	public void setClarity(String clarity) {
		this.clarity = clarity;
	}

	
	
	
}
