package com.study.bank.repository;

import com.study.bank.model.Role;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    public Optional<Role> getRoleByRoleName(Role.RoleName name);
}
