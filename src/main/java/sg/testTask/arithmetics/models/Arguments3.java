package sg.testTask.arithmetics.models;

public class Arguments3 {

    private double argument1;

    private double argument2;

    private double argument3;

    public Arguments3() {
        //nothing
    }

    public Arguments3(double argument1, double argument2, double argument3) {
        this.argument1 = argument1;
        this.argument2 = argument2;
        this.argument3 = argument3;
    }

    public double getArgument1() {
        return argument1;
    }

    public void setArgument1(double argument1) {
        this.argument1 = argument1;
    }

    public double getArgument2() {
        return argument2;
    }

    public void setArgument2(double argument2) {
        this.argument2 = argument2;
    }

    public double getArgument3() {
        return argument3;
    }

    public void setArgument3(double argument3) {
        this.argument3 = argument3;
    }
}
