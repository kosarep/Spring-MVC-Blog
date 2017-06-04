package blog.services;

import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * Created by Grzegorz on 04.06.2017.
 */
@Service
public class UserServiceStubImpl implements UserService {
    @Override
    public boolean authenticate(String username, String password) {
        return Objects.equals(username, password);
    }
}
