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
@RequestMapping("/calculator/mul")
public class MultiplicationController {

    @GetMapping
    public String mulPage(@ModelAttribute("args") ArgumentsMany args,
                          @ModelAttribute("res") Result res) {
        System.out.println("mul called");
        return "views/mul";
    }

    @PostMapping
    public String mulCalculate(@ModelAttribute("args")ArgumentsMany args,
                               @ModelAttribute("res") Result res) {
        res.setResult(
                Operations.multiplicationMultiple(
                        ArgumentsParser.splitConvertStringOfArgs(args.getArgumentsStr(), args.getSplitRegex())
                )
        );
        return "views/mul";
    }


}
