package blog.repositories;

import blog.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jf194405 on 2017-06-08.
 */

@Repository
public interface UserReposiory extends JpaRepository<User, Long> {
}
