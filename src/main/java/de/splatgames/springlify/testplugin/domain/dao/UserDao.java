package de.splatgames.springlify.testplugin.domain.dao;

import de.splatgames.springlify.testplugin.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, Long> {

    User findByUsername(final String username);
}
