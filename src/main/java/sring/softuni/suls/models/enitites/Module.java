package sring.softuni.suls.models.enitites;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Module {

    private Long id;
    private String name;
    private Set<Lecture> lectures;
    //TODO subscribed users


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
    public Set<Lecture> getLectures() {
        return this.lectures;
    }

    public void setLectures(Set<Lecture> lectures) {
        this.lectures = lectures;
    }
}
