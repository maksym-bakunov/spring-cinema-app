package cinema.service.impl;

import cinema.dao.RoleDao;
import cinema.lib.model.Role;
import cinema.service.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImp implements RoleService {
    private RoleDao roleDao;

    public RoleServiceImp(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public Role add(Role role) {
        return roleDao.add(role);
    }

    @Override
    public Role getByName(String roleName) {
        return roleDao.getByName(roleName).orElseThrow(() ->
                new RuntimeException("Role by name " + roleName + " not found"));
    }
}
