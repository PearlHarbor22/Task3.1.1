package web.crud_springboot.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.crud_springboot.dao.UserDao;
import web.crud_springboot.model.User;



import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;
    @Autowired
    public UserServiceImpl(UserDao userDao) {this.userDao = userDao;}

    @Transactional
    public List<User> getAllUsers() {return userDao.getAllUsers();}

    @Transactional
    public void saveUser(User user) {userDao.saveUser(user);}

    @Transactional
    public User getUser(Long id) {return userDao.getUser(id);}

    @Transactional
    public void deleteUser(Long id) {userDao.deleteUser(id);}

    @Transactional
    public void updateUser(User user) {userDao.updateUser(user);}
}
