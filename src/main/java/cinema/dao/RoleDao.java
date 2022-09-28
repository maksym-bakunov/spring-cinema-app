package cinema.dao;

import cinema.lib.model.Role;
import java.util.Optional;

public interface RoleDao {
    Role add(Role role);

    Optional<Role> getByName(String roleName);
}
