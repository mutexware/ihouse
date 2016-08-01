package io.mutexware.ihome.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.mutexware.ihome.model.User;
import io.mutexware.ihome.service.UserService;
import io.mutexware.ihome.service.persistence.UserRepository;
import io.mutexware.ihome.service.persistence.UserRolesRepository;

import java.util.List;

/**
 * Created by tymur on 7/22/16.
 */
@Service
public class LocalUserService implements UserService {

    private UserRepository userRepository;
    private UserRolesRepository userRolesRepository;

    @Autowired
    public LocalUserService(UserRepository userRepository, UserRolesRepository userRolesRepository) {
        this.userRepository = userRepository;
        this.userRolesRepository = userRolesRepository;
    }

    @Override
    public User findUser(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public List<String> getUserRoles(User user) {
        return userRolesRepository.findRolesByEmail(user.getEmail());
    }
}
