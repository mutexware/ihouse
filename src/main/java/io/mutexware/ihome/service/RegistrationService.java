package io.mutexware.ihome.service;

import io.mutexware.ihome.model.User;

/**
 * Created by tymur on 7/21/16.
 */
public interface RegistrationService {
    User registerUser(String email, String password);
    boolean userExists(String email);
    User activateUser(String email, String token);
}
