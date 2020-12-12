package mk.ukim.finki.wpaud.service;

import mk.ukim.finki.wpaud.model.User;

public interface AuthService {
    User login(String username, String password);

}
