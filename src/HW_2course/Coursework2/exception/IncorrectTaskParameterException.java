package HW_2course.Coursework2.exception;

public class IncorrectTaskParameterException extends Exception{
    public String parameter;

    public IncorrectTaskParameterException(String parameter) {
        this.parameter = parameter;
    }

    @Override
    public String getMessage() {
        return "Параметр " + parameter + " задан неверно!";
    }
}
