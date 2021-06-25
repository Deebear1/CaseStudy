package dev.casestudy.fishbar.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.casestudy.fishbar.entity.Water;
import dev.casestudy.fishbar.respository.WaterRespository;


@Service
public class WaterService {

	@Autowired
	WaterRespository Wrepo;

	public Water getById(Long id) {
		return Wrepo.findById(id).get();
	}

	public List<Water> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(Water water) {
		Wrepo.save(water);
	}

	@Transactional
	public void delete(Long id) {
		Wrepo.deleteById(id);
	}

}
