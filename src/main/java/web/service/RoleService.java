package web.service;

import web.model.Role;

public interface RoleService {
    Role findByName(String name);
}
