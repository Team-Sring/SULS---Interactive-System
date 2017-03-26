package sring.softuni.suls.services.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import sring.softuni.suls.authentication.CurrentUser;
import sring.softuni.suls.models.enitites.User;
import sring.softuni.suls.repositories.UserRepository;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findOneByUsername(String username) {
        return this.userRepository.findOneByUsername(username);
    }

    @Override
    public void createAdmin(User admin) {
        this.userRepository.saveAndFlush(admin);
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = this.findOneByUsername(username);
        return new CurrentUser(user);
    }
}
