package sring.softuni.suls.controllers;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import sring.softuni.suls.models.dtos.courseviewmodels.CourseViewModel;
import sring.softuni.suls.models.dtos.moduleviewmodels.ModuleViewModel;
import sring.softuni.suls.models.enitites.Module;
import sring.softuni.suls.services.module.ModuleService;

import java.util.List;

@RestController
public class ModuleController {

    private final ModuleService moduleService;


    @Autowired
    public ModuleController(ModuleService moduleService) {
        this.moduleService = moduleService;
    }

    @GetMapping("/api/modules")
    public @ResponseBody String getAll() {
        List<Module> modules = this.moduleService.getAll();
        CourseViewModel courseViewModel = new CourseViewModel();
        courseViewModel.setId(modules.get(0).getCourses().iterator().next().getId());
        courseViewModel.setName(modules.get(0).getCourses().iterator().next().getName());

        ModuleViewModel moduleViewModel = new ModuleViewModel();
        moduleViewModel.getCourses().add(courseViewModel);
        moduleViewModel.setId(modules.get(0).getId());
        moduleViewModel.setName(modules.get(0).getName());
        return new Gson().toJson(moduleViewModel) ;
    }
}
