package com.pragma.bootcamp2024.adapters.driving.http.mapper.Capacity;

import com.pragma.bootcamp2024.adapters.driving.http.dto.Capacity.request.AddCapacityRequest;
import com.pragma.bootcamp2024.domain.model.Capacity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ICapacityRequestMapper {
    @Mapping(target = "id", ignore = true)
    Capacity addRequestToCapacity(AddCapacityRequest addCapacityRequest);
}
