package sring.softuni.suls.authentication;


import org.springframework.security.core.authority.AuthorityUtils;
import sring.softuni.suls.enums.Role;
import sring.softuni.suls.models.enitites.Authority;
import sring.softuni.suls.models.enitites.User;

public class CurrentUser extends org.springframework.security.core.userdetails.User {

    private User user;

    public CurrentUser(User user) {
        super(user.getUsername(),
                user.getPassword(),
                AuthorityUtils.createAuthorityList(user.getAuthorities().stream()
                        .map(Authority::getName)
                        .toArray(String[]::new)));
        this.user = user;
    }

    public User getUser() {
        return this.user;
    }

    public long getId() {
        return user.getId();
    }

    public Role[] getRoles() {
        return this.user.getAuthorities()
                .stream()
                .map(r -> Role.valueOf(r.getName()))
                .toArray(Role[]::new);
    }
}
