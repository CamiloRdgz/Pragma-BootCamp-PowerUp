package com.pragma.bootcamp2024.adapters.driven.jpa.mysql.adapter;

import com.pragma.bootcamp2024.adapters.driven.jpa.mysql.entity.TechnologyEntity;
import com.pragma.bootcamp2024.adapters.driven.jpa.mysql.exception.ElementNotFoundException;
import com.pragma.bootcamp2024.adapters.driven.jpa.mysql.exception.TechnologyAlreadyExistsException;
import com.pragma.bootcamp2024.adapters.driven.jpa.mysql.mapper.ITechnologyEntityMapper;
import com.pragma.bootcamp2024.adapters.driven.jpa.mysql.repository.ITechnologyRepository;
import com.pragma.bootcamp2024.domain.model.Technology;
import com.pragma.bootcamp2024.domain.spi.ITechnologyPersistencePort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TechnologyAdapter implements ITechnologyPersistencePort {
    private final ITechnologyRepository technologyRepository;
    private final ITechnologyEntityMapper technologyEntityMapper;

    @Override
    public void saveTechnology(Technology technology) {
        if (technologyRepository.findByName(technology.getName()).isPresent()) {
            throw new TechnologyAlreadyExistsException();
        }
        technologyRepository.save(technologyEntityMapper.toEntity(technology));
    }
}
