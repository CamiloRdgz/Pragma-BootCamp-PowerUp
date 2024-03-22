package com.pragma.bootcamp2024.domain.model;

import com.pragma.bootcamp2024.domain.exception.EmptyFieldException;
import com.pragma.bootcamp2024.domain.util.DomainConstants;

import static com.pragma.bootcamp2024.domain.util.DomainConstants.MAX_DESCRIPTION_LENGTH;
import static com.pragma.bootcamp2024.domain.util.DomainConstants.MAX_NAME_LENGTH;
import static java.util.Objects.requireNonNull;

public class Technology {
    private Long id;
    private String name;
    private String description;



    public Technology(Long id, String name, String description) {
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
}
