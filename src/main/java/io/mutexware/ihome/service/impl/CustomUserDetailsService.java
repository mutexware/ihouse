package io.mutexware.ihome.service.impl;

import io.mutexware.ihome.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import io.mutexware.ihome.model.CustomUserDetails;
import io.mutexware.ihome.model.User;

import java.util.List;

/**
 * Created by tymur on 7/21/16.
 */
@Service
public class CustomUserDetailsService implements UserDetailsService {

    private UserService userService;

    @Autowired
    public CustomUserDetailsService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userService.findUser(email);
        if(user == null) {
            throw new UsernameNotFoundException("No user present with email " + email);
        } else {
            List<String> userRoles = userService.getUserRoles(user);
            return new CustomUserDetails(user, userRoles);
        }
    }
}
