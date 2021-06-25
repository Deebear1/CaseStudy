package dev.casestudy.fishbar.respository;



import org.springframework.data.repository.CrudRepository;

import dev.casestudy.fishbar.entity.Fish;

public interface FishRespository extends CrudRepository<Fish, Long> {

	
	

}
