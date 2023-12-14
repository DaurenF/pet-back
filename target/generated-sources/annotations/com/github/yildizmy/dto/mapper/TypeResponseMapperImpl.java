package com.github.yildizmy.dto.mapper;

import com.github.yildizmy.dto.response.TypeResponse;
import com.github.yildizmy.model.Type;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-13T22:51:10+0600",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 18.0.2 (Amazon.com Inc.)"
)
@Component
public class TypeResponseMapperImpl implements TypeResponseMapper {

    @Override
    public Type toEntity(TypeResponse dto) {
        if ( dto == null ) {
            return null;
        }

        Type type = new Type();

        type.setId( dto.getId() );
        type.setName( dto.getName() );
        type.setDescription( dto.getDescription() );

        return type;
    }

    @Override
    public TypeResponse toDto(Type entity) {
        if ( entity == null ) {
            return null;
        }

        TypeResponse typeResponse = new TypeResponse();

        typeResponse.setId( entity.getId() );
        typeResponse.setName( entity.getName() );
        typeResponse.setDescription( entity.getDescription() );

        return typeResponse;
    }
}
