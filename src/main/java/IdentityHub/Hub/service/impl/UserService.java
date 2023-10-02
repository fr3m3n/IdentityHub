//Service for user-related operations.

package IdentityHub.Hub.service.impl;

import IdentityHub.Hub.repository.IUserRepository;
import IdentityHub.Hub.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService implements IUserService {

    @Autowired
    private IUserRepository userRepository;
}
