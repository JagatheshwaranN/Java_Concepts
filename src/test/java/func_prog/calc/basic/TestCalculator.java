package func_prog.calc.basic;

public class TestCalculator {

    public static void main() {
        MathOperation addition = Integer::sum;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (a, b) -> a * b;
        MathOperation division = (a, b) -> a / b;

        int onScreenNumber;
        onScreenNumber = calculate(100, 20, addition);
        onScreenNumber = calculate(onScreenNumber, 20, subtraction);
        onScreenNumber = calculate(onScreenNumber, 2, multiplication);
        onScreenNumber = calculate(onScreenNumber, 10, division);

        System.out.println(onScreenNumber);
    }

    static int calculate(int onScreenNumber, int enteredNumber, MathOperation mathOperation){
        return mathOperation.operate(onScreenNumber, enteredNumber);
    }

}
