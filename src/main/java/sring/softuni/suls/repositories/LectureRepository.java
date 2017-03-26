package sring.softuni.suls.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sring.softuni.suls.models.enitites.Lecture;

@Repository
public interface LectureRepository extends JpaRepository<Lecture,Long> {
}
