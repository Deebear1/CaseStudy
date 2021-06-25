package dev.casestudy.fishbar.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.casestudy.fishbar.entity.Lure;
import dev.casestudy.fishbar.respository.LureRespository;

@Service
public class LureService {

	@Autowired
	LureRespository Lrepo;

	public Lure getById(Long id) {
		return Lrepo.findById(id).get();
	}

	public List<Lure> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(Lure lure) {
		Lrepo.save(lure);
	}

	@Transactional
	public void delete(Long id) {
		Lrepo.deleteById(id);
	}

}
