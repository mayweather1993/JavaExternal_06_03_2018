package task_03.longest_series;

import task_03.MatrixUtils;

public class Runner {
    public static void main(String[] args) {
        int[][] matrix1 = {{98, 2, 2, 2, 5, 7, 20, 110},
                {7, 17, 0, 2, 3, 1, 66, 7},
                {4, 8, 5, 5, 1, 46, 24, 22},
                {53, 11, 33, 33, 33, 33, 22, 33}};

        System.out.println("=====================");
        System.out.println("LETS LOOK AT OUR DATA");
        System.out.println("=====================");
        System.out.println("WE HAVE :\n");
        System.out.println("First line : three '2''s in a row.Longest streak = 3");
        System.out.println("Second line : longest streak = 0");
        System.out.println("Third line : two '5''s in a row.Longest streak = 2");
        System.out.println("Fourth line : four '33''s in a row.longest streak = 4");
        System.out.println("=====================");


        MatrixUtils.printMatrix(matrix1);
        System.out.println("\n");


        System.out.println("============================================================================");
        System.out.println("OK WHAT HAPPENS IF WE GONNA SORT IT BY ASCENDING ORDER BY THE LONGEST SERIES ");
        System.out.println("============================================================================");


        SortByLongestSeriesInMatrix.sortByLongestSeries(matrix1);


        MatrixUtils.printMatrix(matrix1);
        System.out.println("\n");


        System.out.println("THAT'S WORK!! \n");
        System.out.println("GREAT! CYA LATER!");
    }
}
