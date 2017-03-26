package sring.softuni.suls.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sring.softuni.suls.models.enitites.Video;

@Repository
public interface VideoRepository extends JpaRepository<Video,Long> {
}
