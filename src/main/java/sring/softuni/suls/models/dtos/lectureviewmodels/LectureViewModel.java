package sring.softuni.suls.models.dtos.lectureviewmodels;

import sring.softuni.suls.models.dtos.videoviewmodels.VideoViewModel;

public class LectureViewModel {

    private Long id;
    private String title;
    private VideoViewModel video;

    public LectureViewModel() {
    }

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

    public VideoViewModel getVideo() {
        return this.video;
    }

    public void setVideo(VideoViewModel video) {
        this.video = video;
    }
}
