package com.dorotajachtoma.plant.aggregate;

import com.dorotajachtoma.plant.value_objects.PlantId;
import com.dorotajachtoma.plant.value_objects.PlantStatus;

import java.util.UUID;

public record PlantAggregate (
        PlantId plantId,
        String plantName,
        PlantStatus plantStatus,
        UUID ownerId
) {


}
