package com.pragma.bootcamp2024.adapters.driving.http.mapper;

import com.pragma.bootcamp2024.adapters.driving.http.dto.response.TechnologyResponse;
import com.pragma.bootcamp2024.domain.model.Technology;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-20T16:32:13-0500",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.5.jar, environment: Java 20.0.2 (Oracle Corporation)"
)
@Component
public class ITechnologyResponseMapperImpl implements ITechnologyResponseMapper {

    @Override
    public TechnologyResponse toTechnologyResponse(Technology technology) {
        if ( technology == null ) {
            return null;
        }

        Long id = null;
        String name = null;
        String description = null;

        id = technology.getId();
        name = technology.getName();
        description = technology.getDescription();

        TechnologyResponse technologyResponse = new TechnologyResponse( id, name, description );

        return technologyResponse;
    }
}
