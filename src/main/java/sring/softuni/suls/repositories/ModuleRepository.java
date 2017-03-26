package sring.softuni.suls.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sring.softuni.suls.models.enitites.Module;

@Repository
public interface ModuleRepository extends JpaRepository<Module,Long> {
}
