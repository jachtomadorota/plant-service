package com.dorotajachtoma.plant.entities;

import com.dorotajachtoma.owner.domain.Owner;
import com.dorotajachtoma.plant.value_objects.PlantStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "PLANT")
public class Plant {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "PLANT_NAME", nullable = false)
    private String plantName;

    @OneToMany
    @JoinTable(joinColumns = @JoinColumn(name = "PLANT_ID",
               referencedColumnName = "ID"))
    private Owner owner;

    @Column(name = "STATUS", nullable = false)
    private PlantStatus status;

    @Version
    @Column(name = "VERSION", nullable = false)
    private Long version;



}

