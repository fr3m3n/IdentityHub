//Service for role-related operations.

package IdentityHub.Hub.service.impl;

import IdentityHub.Hub.repository.IRoleRepository;
import IdentityHub.Hub.service.IRoleService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Getter
@Setter
@Service
public class RoleService implements IRoleService {

    @Autowired
    private IRoleRepository roleRepository;
}
