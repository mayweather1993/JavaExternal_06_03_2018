package src.com.mayweather.calc;

import java.util.Stack;

public class PostFix {
    private final static String OUR_DELIMETER = " ";

    public static String toPostfix(String infix) {
        boolean isOperator = false;
        boolean finished = false;
        char popped;
        String function = "";
        StringBuilder postfix = new StringBuilder();
        Stack<Character> operator = new Stack<>();


        for (int i = 0; i < infix.length(); i++) {

            char charAt = infix.charAt(i);

            if (operationPrecedence(charAt) == 4 || !postfix.toString().equals("") && operationPrecedence(postfix.charAt(postfix.length() - 2)) == 4 && operationPrecedence(charAt) == 4) {
                function = function.trim();
                function += charAt + OUR_DELIMETER;
            }

            if (!postfix.toString().equals("") && isOperator(charAt) && !function.equals("")) {
                finished = true;
            }

            if (isOperator(charAt)) {
                if (!postfix.toString().equals("") && isOperator(postfix.charAt(postfix.length() - 2)) && !isOperator) {
                    postfix = new StringBuilder(postfix.toString().trim());
                }
                postfix.append(charAt).append(OUR_DELIMETER);
                if (finished) {
                    finished = false;
                    postfix.append(function);
                    function = "";
                }
                isOperator = false;
            } else if (charAt == ')') {
                isOperator = true;
                while ((popped = operator.pop()) != '(')
                    postfix.append(popped).append(OUR_DELIMETER);
            } else if (operationPrecedence(charAt) != 4) {
                isOperator = true;
                while (!operator.isEmpty() && charAt != '(' && operationPrecedence(operator.peek()) >= operationPrecedence(charAt))
                    postfix.append(operator.pop()).append(OUR_DELIMETER);
                operator.push(charAt);
            }
        }
        while (!operator.isEmpty())
            postfix.append(operator.pop()).append(OUR_DELIMETER);

        return postfix.toString();
    }

    private static int operationPrecedence(char n) {
        int i;
        for (i = 0; i < 10; i++) {
            if (n == i + '0')
                return 0;
        }
        if (n == '(' || n == ')') return 1;
        else if (n == '-' || n == '+') return 2;
        else if (n == '*' || n == '/') return 3;
        else return 4;
    }

    private static boolean isOperator(char i) {
        return operationPrecedence(i) <= 0;
    }
}
