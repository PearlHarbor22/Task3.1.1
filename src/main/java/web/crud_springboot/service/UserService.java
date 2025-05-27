package web.crud_springboot.service;



import web.crud_springboot.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(Long id);
    User getUser(Long id);
}
