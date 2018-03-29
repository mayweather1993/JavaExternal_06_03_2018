package task_03.longest;

import task_03.MatrixUtils;

class LongestSeries {

    //find a biggest number of repeated elements in a row
    private static int countOfRepeatedElements(int[] array) {
        int counter = 1;
        int repeated = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                repeated++;
            } else {
                repeated = 1;
            }
            if (repeated > counter) {
                counter = repeated;
            }
        }
        return counter;
    }

    //sorting rows by biggest number of repeating elements
     public static void sortingRepeatingElements(int[][] matrix) {
        for (int i = matrix.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (countOfRepeatedElements(matrix[j]) > countOfRepeatedElements(matrix[j + 1])) {
                    MatrixUtils.swapColumn(matrix[j], matrix[j + 1]);
                }
            }
        }
    }
}
