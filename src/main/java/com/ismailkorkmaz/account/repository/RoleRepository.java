package com.ismailkorkmaz.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ismailkorkmaz.account.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
