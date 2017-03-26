package sring.softuni.suls.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sring.softuni.suls.models.enitites.User;

public interface UserRepository extends JpaRepository<User,Long> {
    User findOneByUsername(String username);
}
