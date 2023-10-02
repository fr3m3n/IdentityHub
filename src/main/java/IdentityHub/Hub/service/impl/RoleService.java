//Service for role-related operations.

package IdentityHub.Hub.service.impl;

import IdentityHub.Hub.repository.IRoleRepository;
import IdentityHub.Hub.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;

public class RoleService implements IRoleService {

    @Autowired
    private IRoleRepository roleRepository;
}
