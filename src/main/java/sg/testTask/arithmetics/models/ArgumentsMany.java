package sg.testTask.arithmetics.models;

public class ArgumentsMany {

    private String argumentsStr;

    private String splitRegex = " ";

    public String getSplitRegex() {
        return splitRegex;
    }

    public void setSplitRegex(String splitRegex) {
        this.splitRegex = splitRegex;
    }

    public ArgumentsMany(String argumentsStr) {
        this.argumentsStr = argumentsStr;
    }

    public ArgumentsMany() {
        //nothing
    }

    public String getArgumentsStr() {
        return argumentsStr;
    }

    public void setArgumentsStr(String argumentsStr) {
        this.argumentsStr = argumentsStr;
    }
}
