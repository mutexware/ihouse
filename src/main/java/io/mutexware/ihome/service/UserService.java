package io.mutexware.ihome.service;

import io.mutexware.ihome.model.User;

import java.util.List;

/**
 * Created by tymur on 7/21/16.
 */
public interface UserService {
    User findUser(String email);
    List<String> getUserRoles(User user);
    User addUser(User user);

}
