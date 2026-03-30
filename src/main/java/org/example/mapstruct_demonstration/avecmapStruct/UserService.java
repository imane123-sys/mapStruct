package org.example.mapstruct_demonstration.avecmapStruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private UserMapper mapper;

    public UserDTO getUser(Long id) {
        User user = repository.findById(id).orElseThrow();
        return mapper.toDTO(user);
    }
}