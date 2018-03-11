package task_01;

public class Rhombus {
    public static void main(String[] args) {

    }

    public static void printRhombus(int diagonal) {
        for (int i = diagonal / 2; i >= diagonal; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (diagonal - i * 2) && i >= 0 ; k++) {
                
            }
        }
    }
}
