package sring.softuni.suls.models.enitites;

import javax.persistence.*;

@Entity
public class Lecture {

    private Long id;
    private String title;
//    private Material material; //TODO
    private Module module;

    public Lecture() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @ManyToOne
    public Module getModule() {
        return this.module;
    }

    public void setModule(Module module) {
        this.module = module;
    }
}
