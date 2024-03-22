package com.pragma.bootcamp2024.adapters.driving.http.mapper.Technology;

import com.pragma.bootcamp2024.adapters.driving.http.dto.Technology.request.AddTechnologyRequest;
import com.pragma.bootcamp2024.domain.model.Technology;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ITechnologyRequestMapper {
    @Mapping(target = "id", ignore = true)
    Technology addRequestToTechnology(AddTechnologyRequest addTechnologyRequest);
}
