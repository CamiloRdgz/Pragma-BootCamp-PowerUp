package com.pragma.bootcamp2024.adapters.driven.jpa.mysql.mapper;

import com.pragma.bootcamp2024.adapters.driven.jpa.mysql.entity.TechnologyEntity;
import com.pragma.bootcamp2024.domain.model.Technology;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ITechnologyEntityMapper {
    Technology toModel(TechnologyEntity technologyEntity);
    TechnologyEntity toEntity(Technology technology);
}
