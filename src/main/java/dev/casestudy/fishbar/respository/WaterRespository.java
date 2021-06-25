package dev.casestudy.fishbar.respository;

import org.springframework.data.repository.CrudRepository;

import dev.casestudy.fishbar.entity.Water;

public interface WaterRespository extends CrudRepository<Water, Long> {

}
