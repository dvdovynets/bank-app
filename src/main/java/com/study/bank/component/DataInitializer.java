package com.study.bank.component;

import com.study.bank.model.Role;
import com.study.bank.model.User;
import java.util.Set;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    @PostConstruct
    public String inject() {
        Role admin = new Role();
        admin.setRoleType(Role.RoleType.ADMIN);
        Role user = new Role();
        user.setRoleType(Role.RoleType.USER);

        User bob = new User();
        bob.setName("bob");
        bob.setPhoneNumber("+380503110068");
        bob.setPassword("1234");
        bob.setRoles(Set.of(admin, user));
        return "Done!";
    }
}
