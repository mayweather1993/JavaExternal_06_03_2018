package src.com.mayweather;

import src.com.mayweather.calc.Calculator;
import src.com.mayweather.calc.PostFix;

import java.io.StringReader;

public class Runner {
    private static final String FIRST_OPERATION = "(2+cos(0))+(19+13)";
    private static final String SECOND_OPERATION = "(3+tan(0))/(7-4)";
    private static final String THIRD_OPERATION = "(7-sin(0))%(11*9)";
    private static final String FOURTH_OPERATION = "3sqrt";

    public static void main(String[] args) {

        /**
         * looking at our first operation
         */
        System.out.println(PostFix.toPostfix(FIRST_OPERATION));
        Readable first = new StringReader(PostFix.toPostfix(FIRST_OPERATION));
        System.out.println("calculate: " + Calculator.calculate(first));


        /**
         * looking at our second operation
         */
        System.out.println(PostFix.toPostfix(SECOND_OPERATION));
        Readable second = new StringReader(PostFix.toPostfix(SECOND_OPERATION));
        System.out.println("calculate: " + Calculator.calculate(second));

        /**
         * looking at our third operation
         */
        System.out.println(PostFix.toPostfix(THIRD_OPERATION));
        Readable third = new StringReader(PostFix.toPostfix(THIRD_OPERATION));
        System.out.println("calculate: " + Calculator.calculate(third));

        /**
         * looking at our fourth operation
         */
        System.out.println(PostFix.toPostfix(FOURTH_OPERATION));
        Readable fourth = new StringReader(PostFix.toPostfix(FOURTH_OPERATION));
        System.out.println("calculate: " + Calculator.calculate(fourth));

    }
}
