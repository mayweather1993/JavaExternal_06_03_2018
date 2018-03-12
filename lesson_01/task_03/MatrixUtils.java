package task_03;

import java.util.Random;

public class MatrixUtils {
    public static int[][] generateMatrix(int i, int j) {
        int[][] matrix = new int[i][j];
        Random random = new Random();
        for (int k = 0; k < i; k++) {
            for (int l = 0; l < j; l++) {
                matrix[k][l] = random.nextInt(100);
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void swap(double[] array, int i, int j) {
        double temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void swapRow(int[][] array, int i, int j) {
        int[] temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static double getAverage(int[] array) {
        double temp = 0;
        for (int i = 0; i < array.length; i++) {
            temp += array[i];
        }
        return temp / array.length;
    }
}
