package sring.softuni.suls.models.enitites;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Course {

    private Long id;
    private String name;
    private Set<Lecture> lectures = new HashSet<>();
    private Module module;

    public Course() {
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

    @OneToMany(mappedBy = "course")
    public Set<Lecture> getLectures() {
        return this.lectures;
    }

    public void setLectures(Set<Lecture> lectures) {
        this.lectures = lectures;
    }

    @ManyToOne
    public Module getModule() {
        return this.module;
    }

    public void setModule(Module module) {
        this.module = module;
    }
}
