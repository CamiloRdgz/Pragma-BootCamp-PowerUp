package com.pragma.bootcamp2024.adapters.driving.http.mapper;

import com.pragma.bootcamp2024.adapters.driving.http.dto.request.AddTechnologyRequest;
import com.pragma.bootcamp2024.domain.model.Technology;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-20T17:09:29-0500",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.5.jar, environment: Java 20.0.2 (Oracle Corporation)"
)
@Component
public class ITechnologyRequestMapperImpl implements ITechnologyRequestMapper {

    @Override
    public Technology addRequestToTechnology(AddTechnologyRequest addTechnologyRequest) {
        if ( addTechnologyRequest == null ) {
            return null;
        }

        String name = null;
        String description = null;

        name = addTechnologyRequest.getName();
        description = addTechnologyRequest.getDescription();

        Long id = null;

        Technology technology = new Technology( id, name, description );

        return technology;
    }
}
