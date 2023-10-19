package sg.testTask.arithmetics.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/calculator")
public class MenuController {

    @GetMapping
    public String menuPage() {
        System.out.println("menuPage called");
        return "views/menu";
    }

}
