package web.crud_springboot.dao;


import web.crud_springboot.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(Long id);
    User getUser(Long id);
}
