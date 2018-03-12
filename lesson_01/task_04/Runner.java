package task_04;

import task_03.MatrixUtils;

public class Runner {
    public static void main(String[] args) {
        int[][] matrix = MatrixUtils.generateMatrix(7, 7);

        System.out.println("=====================");
        System.out.println("LETS LOOK AT OUR DATA");
        System.out.println("=====================");

        MatrixUtils.printMatrix(matrix);
        System.out.println("=========================");
        System.out.println("USING SPIRAL ORDER METHOD");
        System.out.println("=========================");
        System.out.println("\n");

        System.out.println("========================");
        System.out.println("OUR DATA IN SPIRAL ORDER");
        System.out.println("========================");
        Spiral.spiralOrder(matrix);
    }
}
