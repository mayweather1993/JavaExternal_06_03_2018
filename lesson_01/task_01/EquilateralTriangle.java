package task_01;

import java.util.stream.IntStream;

public class EquilateralTriangle {
    public static void main(String[] args) {
        printEquilateralTriangle(7);
        System.out.println("\n");
        printEquilateralTriangleJava8(7);
    }

    public static void printEquilateralTriangleJava8(int length) {
        IntStream.range(0, length).forEach(i -> {
            IntStream.range(0, i).forEach(j -> System.out.print(" "));
            IntStream.range(i, length).forEach(j -> System.out.print("* "));
            System.out.print("\n");
        });
    }

    public static void printEquilateralTriangle(int length) {
        for (int i = 0; i <= length; i++) {
            for (int j = i; j < length; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
