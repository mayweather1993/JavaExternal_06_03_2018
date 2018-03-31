package task_01;

public class RightTriangle {
    public static void main(String[] args) {
        printRightTriangle(5);
    }

    public static void printRightTriangle(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
