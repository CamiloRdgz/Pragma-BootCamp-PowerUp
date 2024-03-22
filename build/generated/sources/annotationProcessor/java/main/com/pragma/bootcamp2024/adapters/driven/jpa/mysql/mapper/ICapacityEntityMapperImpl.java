package com.pragma.bootcamp2024.adapters.driven.jpa.mysql.mapper;

import com.pragma.bootcamp2024.adapters.driven.jpa.mysql.entity.CapacityEntity;
import com.pragma.bootcamp2024.domain.model.Capacity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-21T16:07:05-0500",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.5.jar, environment: Java 20.0.2 (Oracle Corporation)"
)
@Component
public class ICapacityEntityMapperImpl implements ICapacityEntityMapper {

    @Override
    public CapacityEntity toEntity(Capacity capacity) {
        if ( capacity == null ) {
            return null;
        }

        CapacityEntity capacityEntity = new CapacityEntity();

        capacityEntity.setId( capacity.getId() );
        capacityEntity.setName( capacity.getName() );
        capacityEntity.setDescription( capacity.getDescription() );

        return capacityEntity;
    }
}
