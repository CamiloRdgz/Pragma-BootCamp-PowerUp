package com.pragma.bootcamp2024.adapters.driving.http.mapper.Technology;

import com.pragma.bootcamp2024.adapters.driving.http.dto.Technology.response.TechnologyResponse;
import com.pragma.bootcamp2024.domain.model.Technology;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-21T14:45:42-0500",
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

    @Override
    public List<TechnologyResponse> toTechnologyResponseList(List<Technology> technologies) {
        if ( technologies == null ) {
            return null;
        }

        List<TechnologyResponse> list = new ArrayList<TechnologyResponse>( technologies.size() );
        for ( Technology technology : technologies ) {
            list.add( toTechnologyResponse( technology ) );
        }

        return list;
    }
}
