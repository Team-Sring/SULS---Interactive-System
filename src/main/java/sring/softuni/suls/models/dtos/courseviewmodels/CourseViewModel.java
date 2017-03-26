package sring.softuni.suls.models.dtos.courseviewmodels;

import sring.softuni.suls.models.dtos.lectureviewmodels.LectureViewModel;

import java.util.HashSet;
import java.util.Set;

public class CourseViewModel {

    private Long id;
    private String name;
    private Set<LectureViewModel> lectures = new HashSet<>();

    public CourseViewModel() {
    }

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
}
