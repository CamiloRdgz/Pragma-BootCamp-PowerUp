package com.pragma.bootcamp2024.domain.api.usecase;

import com.pragma.bootcamp2024.domain.api.ITechnologyServicePort;
import com.pragma.bootcamp2024.domain.model.Technology;
import com.pragma.bootcamp2024.domain.spi.ITechnologyPersistencePort;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class TechnologyUseCase implements ITechnologyServicePort{
    private final ITechnologyPersistencePort technologyPersistencePort;

    public TechnologyUseCase(ITechnologyPersistencePort technologyPersistencePort) {
        this.technologyPersistencePort = technologyPersistencePort;
    }
    @Override
    public void saveTechnology(Technology technology) {
        technologyPersistencePort.saveTechnology(technology);
    }

    @Override
    public Technology getTechnology(String name) {
        return technologyPersistencePort.getTechnology(name);
    }

    @Override
    public List<Technology> getAllTechnologies(int page, int size) {
        return technologyPersistencePort.getAllTechnologies(page, size);
    }
}
