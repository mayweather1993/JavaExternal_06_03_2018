package task_03.longest;

import task_03.MatrixUtils;

public class Runner {
    public static void main(String[] args) {
        int[][] matrix1 = {{98, 2, 2, 2, 5, 7, 20, 110},
                {7, 17, 0, 2, 3, 1, 66, 7},
                {4, 8, 5, 5, 1, 46, 24, 22},
                {53, 11, 33, 33, 33, 33, 22, 33},
                {18, 11, 90, 91, 33, 1, 2, 0}};

        System.out.println("=====================");
        System.out.println("LETS LOOK AT OUR DATA");
        System.out.println("=====================");


        MatrixUtils.printMatrix(matrix1);
        System.out.println("\n");


        System.out.println("============================================================================");
        System.out.println("OK WHAT HAPPENS IF WE GONNA SORT IT BY ASCENDING ORDER BY THE LONGEST SERIES ");
        System.out.println("============================================================================");


        LongestSeries.sortingRepeatingElements(matrix1);


        MatrixUtils.printMatrix(matrix1);
        System.out.println("\n");


        System.out.println("THAT'S WORK!! \n");
        System.out.println("GREAT! CYA LATER!");

    }
}
