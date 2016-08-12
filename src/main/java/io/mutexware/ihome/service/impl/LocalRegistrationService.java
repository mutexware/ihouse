package io.mutexware.ihome.service.impl;

import io.mutexware.ihome.model.User;
import io.mutexware.ihome.service.RegistrationService;
import io.mutexware.ihome.service.UserService;
import io.mutexware.ihome.throwable.DuplicateUserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by tymur on 8/11/16.
 */
@Service
public class LocalRegistrationService implements RegistrationService {

    private UserService userService;

    @Autowired
    public LocalRegistrationService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public User registerUser(String email, String password) {
        //TODO implement stub
        return null;
    }

    @Override
    public boolean userExists(String email) {
        //TODO implement stub
        return false;
    }

    @Override
    public User activateUser(String email, String token) {
        //TODO implement stub
        return null;
    }
}
