package org.example.mapstruct_demonstration.avecmapStruct;

import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface UserMapper {
        UserDTO toDTO(User user);
}
