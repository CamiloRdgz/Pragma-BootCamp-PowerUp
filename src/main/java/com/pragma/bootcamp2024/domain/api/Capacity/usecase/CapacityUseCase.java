package com.pragma.bootcamp2024.domain.api.Capacity.usecase;

import com.pragma.bootcamp2024.domain.api.Capacity.ICapacityServicePort;
import com.pragma.bootcamp2024.domain.model.Capacity;
import com.pragma.bootcamp2024.domain.spi.ICapacityPersistencePort;

import java.util.List;

public class CapacityUseCase implements ICapacityServicePort {
    private final ICapacityPersistencePort capacityPersistencePort;

    public CapacityUseCase(ICapacityPersistencePort capacityPersistencePort) {
        this.capacityPersistencePort = capacityPersistencePort;
    }

    @Override
    public void saveCapacity(Capacity capacity) {capacityPersistencePort.saveCapacity(capacity);}
}
