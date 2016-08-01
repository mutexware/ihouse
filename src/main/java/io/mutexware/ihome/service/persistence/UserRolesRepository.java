package io.mutexware.ihome.service.persistence;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import io.mutexware.ihome.model.UserRole;

import java.util.List;

/**
 * Created by tymur on 7/21/16.
 */
public interface UserRolesRepository extends CrudRepository<UserRole, Long> {
    @Query("select a.role from UserRole a, User b where b.email = ?1 and a.userId = b.id ")
    public List<String> findRolesByEmail(String email);
}
