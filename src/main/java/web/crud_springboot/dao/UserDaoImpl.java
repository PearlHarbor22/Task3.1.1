package web.crud_springboot.dao;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import web.crud_springboot.model.User;


import java.util.List;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<User> getAllUsers() {
        return em.createQuery("FROM User", User.class).getResultList();
    }

    @Override
    public void saveUser(User user) {
        em.persist(user);
    }

    @Override
    public void updateUser(User user) {
        em.merge(user);
    }

    @Override
    public void deleteUser(Long id) {
        em.remove(em.find(User.class, id));
    }

    @Override
    public User getUser(Long id) {
        return em.find(User.class, id);
    }
}

