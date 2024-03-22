package com.pragma.bootcamp2024.adapters.driving.http.dto.Technology.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class AddTechnologyRequest {
    private final String name;
    private final String description;
}
