package com.pragma.bootcamp2024.domain.spi;

import com.pragma.bootcamp2024.domain.model.Capacity;

public interface ICapacityPersistencePort {
    public void saveCapacity(Capacity capacity);
}
