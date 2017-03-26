package sring.softuni.suls.models.dtos.moduleviewmodels;


import sring.softuni.suls.models.dtos.courseviewmodels.CourseViewModel;

import java.util.HashSet;
import java.util.Set;

public class ModuleViewModel {

    private Long id;
    private String name;
    private Set<CourseViewModel> courses = new HashSet<>();


    public ModuleViewModel() {
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

    public Set<CourseViewModel> getCourses() {
        return this.courses;
    }

    public void setCourses(Set<CourseViewModel> courses) {
        this.courses = courses;
    }
}
