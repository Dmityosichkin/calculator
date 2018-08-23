package calculator;

import java.util.function.DoubleBinaryOperator;

/**
 * @author Dimitry Osichkin
 * @version 1.0
 * @since 1.0
 */
class Calculator {

    String calculate(String[] expression) {
        System.out.println(expression[0]);
        System.out.println(expression[1]);
        System.out.println(expression[2]);
        double a = Double.parseDouble(expression[0]);
        double b = Double.parseDouble(expression[2]);

        double result;
        switch (expression[1]) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                return "Error";
        }
        if (expression.length < 4) {
            return String.valueOf(result);
        }
        double c = Double.parseDouble(expression[4]);
        switch (expression[3]) {

            case "+":
                result = result + c;
                break;
            case "-":
                result = result - c;
                break;
            case "*":
                result = result * c;
                break;
            case "/":
                result = result / c;
                break;
            default:
                return "Error";


        }

        return String.valueOf(result);
    }

}
