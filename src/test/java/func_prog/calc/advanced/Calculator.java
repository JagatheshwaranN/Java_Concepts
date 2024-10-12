package func_prog.calc.advanced;


import java.util.HashMap;
import java.util.Map;

public class Calculator {

    private static final Map<String, MathOperation> map = new HashMap<>();

    static {
        map.put("+", Integer::sum);
        map.put("-", (a, b) -> a - b);
        map.put("*", (a, b) -> a * b);
        map.put("/", (a, b) -> a / b);
    }

    public static int calculate(String expression) {
        String[] exp = expression.split(" ");
        int onScreenNumber = Integer.parseInt(exp[0]);
        for (int i = 1; i < exp.length; i = i + 2) {
            MathOperation operation = map.get(exp[i]);
            int enteredNumber = Integer.parseInt(exp[i + 1]);
            onScreenNumber = performOperation(onScreenNumber, enteredNumber, operation);
        }
        return onScreenNumber;
    }

    static int performOperation(int onScreenNumber, int enteredNumber, MathOperation mathOperation) {
        return mathOperation.operate(onScreenNumber, enteredNumber);
    }

    public static void addOperation(String key, MathOperation operation) {
        map.put(key, operation);
    }

}
