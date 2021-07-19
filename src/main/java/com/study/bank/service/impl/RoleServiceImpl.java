package com.study.bank.service.impl;

import com.study.bank.model.Role;
import com.study.bank.repository.RoleRepository;
import com.study.bank.service.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Role save(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public Role getByName(Role.RoleName name) {
        return roleRepository.getRoleByRoleName(name).orElseThrow();
    }
}
