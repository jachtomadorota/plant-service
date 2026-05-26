package com.dorotajachtoma.plant.services;

import com.dorotajachtoma.plant.repositories.PlantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PlantService {

    private final PlantRepository plantRepository;
}
