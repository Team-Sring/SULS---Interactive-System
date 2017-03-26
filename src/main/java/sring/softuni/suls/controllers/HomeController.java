package sring.softuni.suls.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import sring.softuni.suls.utils.constants.URIMappings;

@Controller
public class HomeController {

    @GetMapping(URIMappings.HOME)
    public String home(){
        return "home/home";
    }
}
