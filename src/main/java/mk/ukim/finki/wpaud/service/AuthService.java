package mk.ukim.finki.wpaud.service;

import mk.ukim.finki.wpaud.model.User;

public interface AuthService {
    User login(String username, String password);

    User register(String username, String password, String repeatPassword, String name, String surname);
}
