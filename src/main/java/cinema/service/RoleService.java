package cinema.service;

import cinema.lib.model.Role;

public interface RoleService {
    Role add(Role role);

    Role getByName(String roleName);
}
