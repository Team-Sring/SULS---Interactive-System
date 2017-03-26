package sring.softuni.suls.models.enitites;

import javax.persistence.*;

@Entity
public class Lecture {

    private Long id;
    private String title;
    private Course course;
    private Video video;
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
    public Course getCourse() {
        return this.course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @OneToOne
    public Video getVideo() {
        return this.video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }
}
