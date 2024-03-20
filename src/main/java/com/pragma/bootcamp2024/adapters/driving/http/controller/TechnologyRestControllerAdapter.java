package com.pragma.bootcamp2024.adapters.driving.http.controller;

import com.pragma.bootcamp2024.adapters.driving.http.dto.request.AddTechnologyRequest;
import com.pragma.bootcamp2024.adapters.driving.http.dto.response.TechnologyResponse;
import com.pragma.bootcamp2024.adapters.driving.http.mapper.ITechnologyRequestMapper;
import com.pragma.bootcamp2024.adapters.driving.http.mapper.ITechnologyResponseMapper;
import com.pragma.bootcamp2024.domain.api.ITechnologyServicePort;
import com.pragma.bootcamp2024.domain.model.Technology;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/technology")
@RequiredArgsConstructor
public class TechnologyRestControllerAdapter {
    private final ITechnologyServicePort technologyServicePort;
    private final ITechnologyRequestMapper technologyRequestMapper;
    private final ITechnologyResponseMapper technologyResponseMapper;

    @PostMapping("/add")
    public ResponseEntity<Void> addTechnology(@RequestBody AddTechnologyRequest request) {
        technologyServicePort.saveTechnology(technologyRequestMapper.addRequestToTechnology(request));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/search/{technologyName}")
    public ResponseEntity<TechnologyResponse> getTechnology(@PathVariable String technologyName) {
        return ResponseEntity.ok(technologyResponseMapper.toTechnologyResponse(technologyServicePort.getTechnology(technologyName)));
    }
}
