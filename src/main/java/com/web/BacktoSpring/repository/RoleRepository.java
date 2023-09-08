package com.web.BacktoSpring.repository;

import com.web.BacktoSpring.entities.Role;
import  org.springframework.data.jpa.repository.JpaRepository;
import  com.web.BacktoSpring.repository.RoleRepository;

//public class RoleRepository { }

public interface RoleRepository extends JpaRepository<Role, String > {

}