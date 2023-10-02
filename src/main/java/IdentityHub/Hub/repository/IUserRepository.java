//CRUD operations for User entity.

package IdentityHub.Hub.repository;

import IdentityHub.Hub.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository <User, Long> {
}
