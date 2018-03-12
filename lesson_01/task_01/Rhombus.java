package task_01;

public class Rhombus {
    public static void main(String[] args) {
        printRhombus(7);
    }

    public static void printRhombus(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                System.out.print(" ");
            }
            for (int k = length - i - 1; k < length; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i < length; i++) {
            for (int j = length - i - 1; j < length; j++) {
                System.out.print(" ");
            }
            for (int k = i; k < length; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


