package task_03.average_task;

import task_03.MatrixUtils;

public class Runner {
    public static void main(String[] args) {
        int[][] matrix1 = MatrixUtils.generateMatrix(3, 3);
        int[][] matrix2 = MatrixUtils.generateMatrix(5, 5);
        int[][] matrix3 = MatrixUtils.generateMatrix(7, 7);

        System.out.println("=====================");
        System.out.println("LETS LOOK AT OUR DATA");
        System.out.println("=====================");


        MatrixUtils.printMatrix(matrix1);
        System.out.println("\n");
        MatrixUtils.printMatrix(matrix2);
        System.out.println("\n");
        MatrixUtils.printMatrix(matrix3);
        System.out.println("\n");

        System.out.println("===============================================================");
        System.out.println("OK WHAT HAPPENS IF WE GONNA SORT IT BY AVERAGE DESCENDING ORDER");
        System.out.println("===============================================================");


        DescendingAverageSort.averageSort(matrix1);
        DescendingAverageSort.averageSort(matrix2);
        DescendingAverageSort.averageSort(matrix3);

        MatrixUtils.printMatrix(matrix1);
        System.out.println("\n");
        MatrixUtils.printMatrix(matrix2);
        System.out.println("\n");
        MatrixUtils.printMatrix(matrix3);
        System.out.println("\n");


        System.out.println("GREAT! GOOD JOB!");

    }
}
