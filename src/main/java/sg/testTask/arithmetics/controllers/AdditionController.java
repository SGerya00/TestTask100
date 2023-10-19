package sg.testTask.arithmetics.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sg.testTask.arithmetics.ArgumentsParser;
import sg.testTask.arithmetics.Operations;
import sg.testTask.arithmetics.models.ArgumentsMany;
import sg.testTask.arithmetics.models.Result;

@Controller
@RequestMapping("/calculator/add")
public class AdditionController {

    @GetMapping
    public String additionPage(@ModelAttribute("args") ArgumentsMany args,
                               @ModelAttribute("res") Result res) {
        System.out.println("add called");
        return "views/add";
    }

    @PostMapping
    public String additionCalculate(@ModelAttribute("args")ArgumentsMany args,
                                    @ModelAttribute("res") Result res) {
        res.setResult(
                Operations.additionMultiple(
                        ArgumentsParser.splitConvertStringOfArgs(args.getArgumentsStr(), args.getSplitRegex())
                )
        );
        return "views/add";
    }

}
