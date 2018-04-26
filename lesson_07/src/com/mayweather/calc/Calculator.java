package src.com.mayweather.calc;

import java.util.Scanner;
import java.util.Stack;

public class Calculator {

    public static double calculate(Readable readable) {
        Stack<Double> stack = new Stack<>();
        Scanner input = new Scanner(readable);
        double a;
        double b;

        while (input.hasNext()) {
            if (input.hasNextDouble()) {
                stack.push(input.nextDouble());
            } else {
                String next = input.next();
                switch (next) {
                    case "/":
                        a = stack.pop();
                        b = stack.pop();
                        stack.push(b / a);
                        break;
                    case "*":
                        a = stack.pop();
                        b = stack.pop();
                        stack.push(b * a);
                        break;
                    case "+":
                        a = stack.pop();
                        b = stack.pop();
                        stack.push(b + a);
                        break;
                    case "-":
                        a = stack.pop();
                        b = stack.pop();
                        stack.push(b - a);
                        break;
                    case "%":
                        a = stack.pop();
                        b = stack.pop();
                        stack.push(b % a);
                        break;
                    case "sin":
                        stack.push(Math.sin(stack.pop()));
                        break;
                    case "cos":
                        stack.push(Math.cos(stack.pop()));
                        break;
                    case "tan":
                        stack.push(Math.tan(stack.pop()));
                        break;
                    case "asin":
                        stack.push(Math.asin(stack.pop()));
                        break;
                    case "acos":
                        stack.push(Math.acos(stack.pop()));
                        break;
                    case "atan":
                        stack.push(Math.atan(stack.pop()));
                        break;
                    case "atan2":
                        a = stack.pop();
                        b = stack.pop();
                        stack.push(Math.atan2(b, a));
                        break;
                    case "exp":
                        stack.push(Math.exp(stack.pop()));
                        break;
                    case "sinh":
                        stack.push(Math.sinh(stack.pop()));
                        break;
                    case "cosh":
                        stack.push(Math.cosh(stack.pop()));
                        break;
                    case "tanh":
                        stack.push(Math.tanh(stack.pop()));
                        break;
                    case "round":
                        stack.push((double) Math.round(stack.pop()));
                        break;
                    case "pow":
                        a = stack.pop();
                        b = stack.pop();
                        stack.push(Math.pow(a, b));
                        break;
                    case "log":
                        stack.push(Math.log(stack.pop()));
                        break;
                    case "ceil":
                        stack.push(Math.ceil(stack.pop()));
                        break;
                    case "floor":
                        stack.push(Math.floor(stack.pop()));
                        break;
                    case "sqrt":
                        stack.push(Math.sqrt(stack.pop()));
                        break;
                    case "abs":
                        stack.push(Math.abs(stack.pop()));
                        break;
                    case "max":
                        a = stack.pop();
                        b = stack.pop();
                        stack.push(Math.max(b, a));
                        break;
                    case "min":
                        a = stack.pop();
                        b = stack.pop();
                        stack.push(Math.min(b, a));
                        break;
                    default:
                        System.out.println("You cannot do this." + next);
                }
            }
        }
        return stack.pop();
    }
}

