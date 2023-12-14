package com.github.yildizmy.dto.mapper;

import com.github.yildizmy.dto.request.TypeRequest;
import com.github.yildizmy.model.Type;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-13T22:51:10+0600",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 18.0.2 (Amazon.com Inc.)"
)
@Component
public class TypeRequestMapperImpl implements TypeRequestMapper {

    @Override
    public Type toEntity(TypeRequest dto) {
        if ( dto == null ) {
            return null;
        }

        Type type = new Type();

        type.setId( dto.getId() );
        type.setDescription( dto.getDescription() );

        type.setName( org.apache.commons.text.WordUtils.capitalizeFully(dto.getName()) );

        return type;
    }

    @Override
    public TypeRequest toDto(Type entity) {
        if ( entity == null ) {
            return null;
        }

        TypeRequest typeRequest = new TypeRequest();

        typeRequest.setId( entity.getId() );
        typeRequest.setName( entity.getName() );
        typeRequest.setDescription( entity.getDescription() );

        return typeRequest;
    }
}
