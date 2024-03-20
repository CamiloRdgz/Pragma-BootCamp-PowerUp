package com.pragma.bootcamp2024.domain.api.usecase;

import com.pragma.bootcamp2024.domain.api.ITechnologyServicePort;
import com.pragma.bootcamp2024.domain.model.Technology;
import com.pragma.bootcamp2024.domain.spi.ITechnologyPersistencePort;

public class TechnologyUseCase implements ITechnologyServicePort{
    private final ITechnologyPersistencePort technologyPersistencePort;

    public TechnologyUseCase(ITechnologyPersistencePort technologyPersistencePort) {
        this.technologyPersistencePort = technologyPersistencePort;
    }
    @Override
    public void saveTechnology(Technology technology) {
        technologyPersistencePort.saveTechnology(technology);
    }
}
