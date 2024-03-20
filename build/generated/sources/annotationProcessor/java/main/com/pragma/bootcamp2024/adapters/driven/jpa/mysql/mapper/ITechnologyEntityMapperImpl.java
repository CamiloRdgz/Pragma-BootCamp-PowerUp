package com.pragma.bootcamp2024.adapters.driven.jpa.mysql.mapper;

import com.pragma.bootcamp2024.adapters.driven.jpa.mysql.entity.TechnologyEntity;
import com.pragma.bootcamp2024.domain.model.Technology;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-20T16:32:13-0500",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.5.jar, environment: Java 20.0.2 (Oracle Corporation)"
)
@Component
public class ITechnologyEntityMapperImpl implements ITechnologyEntityMapper {

    @Override
    public Technology toModel(TechnologyEntity technologyEntity) {
        if ( technologyEntity == null ) {
            return null;
        }

        Long id = null;
        String name = null;
        String description = null;

        id = technologyEntity.getId();
        name = technologyEntity.getName();
        description = technologyEntity.getDescription();

        Technology technology = new Technology( id, name, description );

        return technology;
    }

    @Override
    public TechnologyEntity toEntity(Technology technology) {
        if ( technology == null ) {
            return null;
        }

        TechnologyEntity technologyEntity = new TechnologyEntity();

        technologyEntity.setId( technology.getId() );
        technologyEntity.setName( technology.getName() );
        technologyEntity.setDescription( technology.getDescription() );

        return technologyEntity;
    }
}
