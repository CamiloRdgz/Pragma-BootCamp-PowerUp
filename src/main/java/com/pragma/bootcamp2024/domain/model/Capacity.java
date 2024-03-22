package com.pragma.bootcamp2024.domain.model;

import com.pragma.bootcamp2024.domain.exception.EmptyFieldException;
import com.pragma.bootcamp2024.domain.util.DomainConstants;

import java.lang.reflect.Array;
import java.util.List;

import static com.pragma.bootcamp2024.domain.util.DomainConstants.MAX_DESCRIPTION_LENGTH;
import static com.pragma.bootcamp2024.domain.util.DomainConstants.MAX_NAME_LENGTH;
import static java.util.Objects.requireNonNull;

public class Capacity {
    private final Long id;
    private final String name;
    private final String description;
    private final String technologies;

    public Capacity(Long id, String name, String description, List<Technology> technologies) {

        if (name.trim().isEmpty()) {
            throw new EmptyFieldException(DomainConstants.Field.NAME.toString());
        }
        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException(DomainConstants.Field.NAME.toString());
        }
        if (description.trim().isEmpty()) {
            throw new EmptyFieldException(DomainConstants.Field.DESCRIPTION.toString());
        }
        if (description.length() > MAX_DESCRIPTION_LENGTH) {
            throw new IllegalArgumentException(DomainConstants.Field.DESCRIPTION.toString());
        }

        this.id = id;
        this.name = requireNonNull(name, DomainConstants.FIELD_NAME_NULL_MESSAGE);
        this.description = requireNonNull(description, DomainConstants.FIELD_DESCRIPTION_NULL_MESSAGE);
        this.technologies = technologies.toString();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getTechnologies() {
        String[] technologiesArr = technologies.split(",");
        return List.of(technologiesArr);
    }
}
