package com.pragma.bootcamp2024.domain.spi;

import com.pragma.bootcamp2024.domain.model.Technology;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ITechnologyPersistencePort {
    void saveTechnology(Technology technology);

    Technology getTechnology(String name);

    List<Technology> getAllTechnologies(int page, int size);
}
