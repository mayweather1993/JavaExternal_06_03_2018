package task_03;

import java.util.Random;

public class MatrixUtils {
    //generate matrix
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

    //print matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void swapColumn(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) {
            int tmp = array1[i];
            array1[i] = array2[i];
            array2[i] = tmp;
        }
    }

    //find average in matrix
    public static double getAverage(int[][] mas, int j) {
        double sum = 0;
        double average = 0;
        for (int i = 0; i < mas.length; i++) {
            sum += mas[i][j];
        }
        average = sum / mas.length;
        return average;
    }
}
