package org.example.mapstruct_demonstration.sansMapstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public UserDTO getUser(Long id) {

        User user = repository.findById(id).orElseThrow();

        UserDTO dto = new UserDTO();
        dto.setId(user.getId());
        dto.setNom(user.getNom());

        return dto;
    }
}