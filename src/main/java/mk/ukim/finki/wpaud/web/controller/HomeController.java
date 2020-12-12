package mk.ukim.finki.wpaud.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping
    public String getHome(Model model) {
        model.addAttribute("bodyContent", "home");
        return "master-template";
    }

}
