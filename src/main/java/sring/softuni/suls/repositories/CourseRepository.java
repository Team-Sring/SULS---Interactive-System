package sring.softuni.suls.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sring.softuni.suls.models.enitites.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {
}
