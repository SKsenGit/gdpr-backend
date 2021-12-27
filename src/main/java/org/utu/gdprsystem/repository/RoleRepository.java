package org.utu.gdprsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.utu.gdprsystem.models.Role;
import org.utu.gdprsystem.models.URole;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
    Optional<Role> findByName(URole name);
}
