package dev.casestudy.fishbar.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Fish {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private String color;
	private String habitat;
	private int size;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "lure_fish",
    joinColumns = @JoinColumn(name="fish_id"),
    inverseJoinColumns = @JoinColumn(name="lure_id")
)
	private List<Lure> lures= new ArrayList<>();

	public Fish() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fish(Long id, String name, String color, String habitat, int size) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.habitat = habitat;
		this.size = size;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;

	}

	public List<Lure> getLures() {
		return lures;
	}

	public void setLures(List<Lure> lures) {
		this.lures = lures;
	}

}
