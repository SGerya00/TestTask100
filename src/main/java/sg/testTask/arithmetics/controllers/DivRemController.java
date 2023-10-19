package sg.testTask.arithmetics.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sg.testTask.arithmetics.Operations;
import sg.testTask.arithmetics.models.Arguments2;
import sg.testTask.arithmetics.models.Result;

@Controller
@RequestMapping("/calculator/divrem")
public class DivRemController {

    @GetMapping
    public String divremPage(@ModelAttribute("args") Arguments2 args,
                             @ModelAttribute("res") Result res) {
        System.out.println("divrem called");
        return "views/divrem";
    }

    @PostMapping
    public String divremCalculate(@ModelAttribute("args")Arguments2 args,
                                  @ModelAttribute("res") Result res) {
        res.setResult(Operations.divisionRemainder(args.getArgument1(), args.getArgument2()));
        return "views/divrem";
    }
}
