package org.example.mapstruct_demonstration.avecmapStruct;



import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
