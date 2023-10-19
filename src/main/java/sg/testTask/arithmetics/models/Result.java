package sg.testTask.arithmetics.models;

public class Result {

    private String result = "no result yet";

    public Result() {
        //nothing
    }

    public Result(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
