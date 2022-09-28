package cinema.service;

import cinema.lib.model.User;

public interface AuthenticationService {
    User register(String email, String password);
}
