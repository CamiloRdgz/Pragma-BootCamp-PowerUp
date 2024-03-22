package com.pragma.bootcamp2024.adapters.driving.http.mapper.Capacity;

import com.pragma.bootcamp2024.adapters.driving.http.dto.Capacity.request.AddCapacityRequest;
import com.pragma.bootcamp2024.domain.model.Capacity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-21T15:50:10-0500",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.5.jar, environment: Java 20.0.2 (Oracle Corporation)"
)
@Component
public class ICapacityRequestMapperImpl implements ICapacityRequestMapper {

    @Override
    public Capacity addRequestToCapacity(AddCapacityRequest addCapacityRequest) {
        if ( addCapacityRequest == null ) {
            return null;
        }

        String name = null;
        String description = null;

        name = addCapacityRequest.getName();
        description = addCapacityRequest.getDescription();

        Long id = null;

        Capacity capacity = new Capacity( id, name, description );

        return capacity;
    }
}
