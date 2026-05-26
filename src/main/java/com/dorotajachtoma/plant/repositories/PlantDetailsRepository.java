package com.dorotajachtoma.plant.repositories;

import com.dorotajachtoma.plant.entities.PlantDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantDetailsRepository extends JpaRepository<String, PlantDetails> {
}
