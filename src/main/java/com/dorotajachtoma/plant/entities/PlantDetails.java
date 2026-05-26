package com.dorotajachtoma.plant.entities;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@DiscriminatorValue("DETAILS")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class PlantDetails extends Plant {

    @Column(name = "NICKNAME")
    private String nickname;

    @Column(name = "ORIGIN")
    private String origin;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "NOTES_TXT")
    private String notes;

    @Column(name = "PURCHASE_TIMESTAMP", nullable = false)
    private LocalDateTime purchaseTimestamp;

    @Column(name = "PLANTING_TIMESTAMP", nullable = false)
    private LocalDateTime plantingTimestamp;

}
