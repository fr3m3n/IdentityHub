//Service for user-related operations.

package IdentityHub.Hub.service.impl;

import IdentityHub.Hub.repository.IUserRepository;
import IdentityHub.Hub.service.IUserService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Getter
@Setter
@Service
public class UserService implements IUserService {

    @Autowired
    private IUserRepository userRepository;
}
