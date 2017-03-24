package sring.softuni.suls.repositories.lectures;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sring.softuni.suls.models.enitites.Module;

@RepositoryRestResource(collectionResourceRel = "module", path = "module")
public interface ModuleRepository extends JpaRepository<Module,Long> {
}
