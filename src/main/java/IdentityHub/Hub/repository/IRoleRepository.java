//CRUD operations for Role entity.

package IdentityHub.Hub.repository;

import IdentityHub.Hub.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleRepository extends JpaRepository <Role, Long> {
}
