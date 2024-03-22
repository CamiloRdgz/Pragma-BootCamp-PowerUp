package com.pragma.bootcamp2024.adapters.driving.http.dto.Capacity.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class AddCapacityRequest {
    private final String name;
    private final String description;
    private final String technologies;
}
