package blog.services;

/**
 * Created by Grzegorz on 04.06.2017.
 */
public interface UserService {
    boolean authenticate(String username, String password);
}
