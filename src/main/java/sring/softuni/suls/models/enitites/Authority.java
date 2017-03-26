package sring.softuni.suls.models.enitites;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Authority {

    private Long id;
    private String name;
    private Set<User> users = new HashSet<>(0);

    public Authority() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToMany(mappedBy = "authorities", cascade = CascadeType.ALL)
    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
