package com.dorotajachtoma.plant.aggregate;

import com.dorotajachtoma.plant.entities.Plant;
import com.dorotajachtoma.plant.entities.PlantDetails;

public record PlantAggregate (Plant plant,
                              PlantDetails plantDetails) {


}
