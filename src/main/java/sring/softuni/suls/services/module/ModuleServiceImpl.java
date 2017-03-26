package sring.softuni.suls.services.module;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sring.softuni.suls.models.enitites.Module;
import sring.softuni.suls.repositories.ModuleRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ModuleServiceImpl implements ModuleService {

    private final ModuleRepository moduleRepository;

    @Autowired
    public ModuleServiceImpl(ModuleRepository moduleRepository) {
        this.moduleRepository = moduleRepository;
    }

    @Override
    public List<Module> getAll() {
        return this.moduleRepository.findAll();
    }
}
