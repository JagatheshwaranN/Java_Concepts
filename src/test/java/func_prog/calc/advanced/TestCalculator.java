package func_prog.calc.advanced;

public class TestCalculator {

    public static void main(String[] args) {
        String expression = "5 + 2 - 3 * 7 + 2 / 3 ^ 2";
        Calculator.addOperation("^", (a, b) -> (int) Math.pow(a, b));
        System.out.println(Calculator.calculate(expression));
    }
}
