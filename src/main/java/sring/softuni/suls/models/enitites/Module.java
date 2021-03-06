package sring.softuni.suls.models.enitites;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Module {

    private Long id;
    private String name;
    private Set<Course> courses = new HashSet<>();

    public Module() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "module")
    public Set<Course> getCourses() {
        return this.courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }
}
