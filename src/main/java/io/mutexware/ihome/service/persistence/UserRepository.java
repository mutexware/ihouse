package io.mutexware.ihome.service.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import io.mutexware.ihome.model.User;

/**
 * Created by tymur on 7/21/16.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long>{
    public User findByEmail(String email);
}
