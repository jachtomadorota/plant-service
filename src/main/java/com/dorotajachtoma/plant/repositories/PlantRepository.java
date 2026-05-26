package com.dorotajachtoma.plant.repositories;

import com.dorotajachtoma.plant.entities.Plant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantRepository extends JpaRepository<String, Plant> {
}
