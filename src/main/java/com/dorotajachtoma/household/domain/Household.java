package com.dorotajachtoma.household.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.TimeZone;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "HOUSEHOLD")
public class Household {

    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Setter
    @Column(name = "NAME", nullable = false)
    private String name;

    @Setter
    @Column(name = "ADDRESS", nullable = false)
    private String address;

    @Setter
    @Column(name = "CREATED_AT", nullable = false)
    private LocalDateTime createdAt;

    @Setter
    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Transient
    @Column(name = "TIMZE_ZONE", nullable = false)
    private String timeZone;

    public void setTimeZone(String timeZone) {
        this.timeZone = TimeZone.getTimeZone(timeZone).getID();
    }

}
