package sring.softuni.suls.authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import sring.softuni.suls.models.enitites.Authority;
import sring.softuni.suls.models.enitites.User;
import sring.softuni.suls.services.user.UserService;
import sring.softuni.suls.utils.constants.AdminData;

import javax.annotation.PostConstruct;

@Component
public class AdminInitializer {

    private final UserService userService;

    @Autowired
    public AdminInitializer(UserService userService) {
        this.userService = userService;
    }

    @PostConstruct
    private void init() {
        User admin = this.userService.findOneByUsername(AdminData.ADMIN_USERNAME);

        if (admin == null) {
            admin = new User();
            admin.setUsername(AdminData.ADMIN_USERNAME);
            admin.setPassword(new BCryptPasswordEncoder().encode(AdminData.ADMIN_PASSWORD));
            Authority authority = new Authority();
            authority.setName(AdminData.ADMIN_ROLE);
            admin.getAuthorities().add(authority);
            this.userService.createAdmin(admin);
        }
    }
}