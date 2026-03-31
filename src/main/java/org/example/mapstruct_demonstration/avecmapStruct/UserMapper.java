package org.example.mapstruct_demonstration.avecmapStruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel="spring")

public interface UserMapper {
        @Mapping(source="fullName",target="nom")
        UserDTO toDTO(User user);
        User toEntity(UserDTO user);

}
