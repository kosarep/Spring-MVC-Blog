package blog.services;

import blog.models.User;

import java.util.List;

/**
 * Created by Grzegorz on 04.06.2017.
 */
public interface UserService {

    List<User> findAll();
    User findById(Long id);
    User create(User user);
    User edit(User user);
    void deleteById(Long id);

}
