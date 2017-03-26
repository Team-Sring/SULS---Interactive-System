package sring.softuni.suls.services.user;


import org.springframework.security.core.userdetails.UserDetailsService;
import sring.softuni.suls.models.enitites.User;

public interface UserService extends UserDetailsService {

    User findOneByUsername(String username);

    void createAdmin(User admin);
}
