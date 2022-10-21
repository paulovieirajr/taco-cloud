package br.dev.paulovieira.tacocloud.repository;

import br.dev.paulovieira.tacocloud.model.*;
import org.springframework.data.jpa.repository.*;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("select u from User u where u.username = ?1")
    User findByUsername(String username);
}
