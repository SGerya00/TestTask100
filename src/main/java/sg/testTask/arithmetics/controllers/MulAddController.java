package sg.testTask.arithmetics.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sg.testTask.arithmetics.Operations;
import sg.testTask.arithmetics.models.Arguments3;
import sg.testTask.arithmetics.models.Result;

@Controller
@RequestMapping("/calculator/muladd")
public class MulAddController {

    @GetMapping
    public String muladdPage(@ModelAttribute("args")Arguments3 args,
                             @ModelAttribute("res") Result res) {
        System.out.println("muladd called");
        return "views/muladd";
    }

    @PostMapping
    public String muladdCalculate(@ModelAttribute("args")Arguments3 args,
                                  @ModelAttribute("res") Result res) {
        res.setResult(Operations.multiplicationAddition(args.getArgument1(), args.getArgument2(), args.getArgument3()));
        return "views/muladd";
    }
}
