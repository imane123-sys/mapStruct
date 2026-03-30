package org.example.mapstruct_demonstration.sansMapstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping("/users")
    public class UserController {

        @Autowired
        private UserService service;

        @GetMapping("/{id}")
        public UserDTO getUser(@PathVariable Long id) {
            return service.getUser(id);
        }
    }

