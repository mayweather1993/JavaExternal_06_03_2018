package task_01;

import java.util.stream.IntStream;

public class EquilateralTriangle {
    public static void main(String[] args) {
        printEquilateralTriangle(7);
    }

    public static void printEquilateralTriangle(int length) {
        IntStream.range(0, length).forEach(i -> {
            IntStream.range(0, i).forEach(j -> System.out.print(" "));
            IntStream.range(i, length).forEach(j -> System.out.print("* "));
            System.out.print("\n");
        });
    }
}
