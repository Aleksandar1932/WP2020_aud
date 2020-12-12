package mk.ukim.finki.wpaud.service;

import mk.ukim.finki.wpaud.model.User;
import mk.ukim.finki.wpaud.model.enumerations.Role;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserService extends UserDetailsService {
    User register(String username, String password, String repeatPassword, String name, String surname, Role role);

}
