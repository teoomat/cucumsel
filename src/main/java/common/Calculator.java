package common;

public class Calculator {

    private int firstNumber;
    private int secondNumber;
    private int result;

    public void setFirstNumber(int numb1) {
        firstNumber = numb1;
    }

    public void setSecondNumber(int numb2) {
        secondNumber = numb2;
    }

    public void add() {
        result =  firstNumber + secondNumber;
    }

    public void sub() {
        result = firstNumber - secondNumber;
    }

    public int getResult() {
        return result;
    }
}