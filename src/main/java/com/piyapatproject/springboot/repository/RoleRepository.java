package com.piyapatproject.springboot.repository;

import com.piyapatproject.springboot.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}
