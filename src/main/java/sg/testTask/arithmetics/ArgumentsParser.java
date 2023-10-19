package sg.testTask.arithmetics;

import java.util.ArrayList;
import java.util.List;

public abstract class ArgumentsParser {

    public static List<Double> splitConvertStringOfArgs(String args, String regex) {
        String[] splitArgs = args.split(regex);
        List<Double> argsForReturn = new ArrayList<>();
        for(String argument : splitArgs) {
            double arg = 0.0;
            try {
                arg = Double.parseDouble(argument);
            } catch (NumberFormatException e) {
                System.err.println(e.getClass().toString() + " " + e.getMessage());
                //skip element, move to next
                continue;
            } catch (NullPointerException e) {
                System.err.println(e.getMessage());
                //none of the elements in splitArgs are supposed to be null
                //do not proceed, return immediately
                return argsForReturn;
            }
            argsForReturn.add(arg);
        }
        return argsForReturn;
    }

}
