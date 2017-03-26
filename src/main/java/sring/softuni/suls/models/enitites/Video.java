package sring.softuni.suls.models.enitites;

import javax.persistence.*;

@Entity
public class Video {

    private Long id;
    private String name;
    private String link;
    private Lecture lecture;

    public Video() {
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

    public String getLink() {
        return this.link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @OneToOne(mappedBy = "video")
    public Lecture getLecture() {
        return this.lecture;
    }

    public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }
}
