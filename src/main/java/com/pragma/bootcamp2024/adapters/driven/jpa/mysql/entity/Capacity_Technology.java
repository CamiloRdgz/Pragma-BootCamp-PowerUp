package com.pragma.bootcamp2024.adapters.driven.jpa.mysql.entity;

import com.pragma.bootcamp2024.domain.model.Capacity;
import com.pragma.bootcamp2024.domain.model.Technology;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "capacity_technology")
@Getter
@Setter
public class Capacity_Technology {
    private final Long capacity_id;
    private final Long technology_id;

    public Capacity_Technology(Capacity capacity, Technology technology) {
        this.capacity_id = capacity.getId();
        this.technology_id = technology.getId();
    }
}
