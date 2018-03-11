package task_01;

public class Rectangle {
    public static void main(String[] args) {
        printRectangle(5, 15);
    }

    public static void printRectangle(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.print(" ");
    }
}