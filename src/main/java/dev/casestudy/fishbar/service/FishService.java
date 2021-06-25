package dev.casestudy.fishbar.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.casestudy.fishbar.entity.Fish;
import dev.casestudy.fishbar.respository.FishRespository;


@Service
public class FishService {

	

	FishRespository Frepo;
	@Autowired
	public FishService(FishRespository Frepo) {
	this.Frepo= Frepo;	
	}
	public void save(Fish fish) {
		Frepo.save(fish);
	}

	public List<Fish> listAll() {
		return (List<Fish>) Frepo.findAll();
	}

	public Fish get(Long id) {
		return Frepo.findById(id).get();
	}

	@Transactional
	public void delete(Long id) {
		Frepo.deleteById(id);
	}

	public void update(Fish fish) {
    	Fish fishFound = Frepo.findById(fish.getId()).get();
    	fishFound.setName(fish.getName());
    	fishFound.setColor(fish.getColor());
    	fishFound.setHabitat(fish.getHabitat());
    	fishFound.setSize(fish.getSize());
    	fishFound.setLures(fish.getLures());
	}
	
}
