package com.study.bank.service;

import com.study.bank.model.Role;

public interface RoleService {
    Role save(Role role);

    Role getByName(Role.RoleName name);
}
