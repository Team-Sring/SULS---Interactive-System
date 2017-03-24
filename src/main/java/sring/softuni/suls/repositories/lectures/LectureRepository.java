package sring.softuni.suls.repositories.lectures;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sring.softuni.suls.models.enitites.Lecture;

@RepositoryRestResource(collectionResourceRel = "lecture", path = "lecture")
public interface LectureRepository extends JpaRepository<Lecture,Long> {
}
