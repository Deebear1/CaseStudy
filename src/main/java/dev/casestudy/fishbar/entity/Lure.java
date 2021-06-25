package dev.casestudy.fishbar.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;



@Entity
public class Lure {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private String color;
	private String liveBait;
	private int size;
	private String movement;

	@ManyToMany(mappedBy="lures")
	private List<Fish> fish;

	public Lure() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Lure(Long id, String name, String color, String liveBait, int size, String movement) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.liveBait = liveBait;
		this.size = size;
		this.movement = movement;
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

	public String getLiveBait() {
		return liveBait;
	}

	public void setLiveBait(String liveBait) {
		this.liveBait = liveBait;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getMovement() {
		return movement;
	}

	public void setMovement(String movement) {
		this.movement = movement;
	}
	public List<Fish> getFish() {
		return fish;
	}

	public void setFish(List<Fish> fish) {
		this.fish = fish;
	}

}
