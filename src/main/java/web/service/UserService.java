package web.service;

import web.model.User;
import java.util.List;

public interface UserService {

    void createUser(User user);
    void updateUser(User user);
    void deleteUserById(Long id);
    List<User> getAllUsers();
    User findById(Long id);
    User findByEmail(String email);
}