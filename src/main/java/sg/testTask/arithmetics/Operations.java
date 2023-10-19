package sg.testTask.arithmetics;

import java.util.List;

public abstract class Operations {

    public static String additionMultiple(List<Double> args) {
        double accumulator = 0.0;
        if (args.size() < 2) {
            return "Less than 2 valid arguments provided for addition";
        }
        for(double a : args) {
            accumulator += a;
        }
        return Double.toString(accumulator);
    }

    public static String multiplicationMultiple(List<Double> args) {
        double accumulator = 1.0;
        if (args.size() < 2) {
            return "Less than 2 valid arguments provided for multiplication";
        }
        for(double a : args) {
            accumulator *= a;
        }
        return Double.toString(accumulator);
    }

    public static String multiplicationAddition(double arg1, double arg2, double arg3) {
        return Double.toString((arg1 * arg2) + arg3);
    }

    public static String divisionRemainder(double arg1, double arg2) {
        if (0 == Double.compare(0.0, arg2)) {
            return "Divisor cannot be 0";
        }
        int product = Integer.parseInt(((Double.toString(arg1 / arg2)).split("\\."))[0]);
        return Double.toString(arg1 - (product * arg2));
    }

}
