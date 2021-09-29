package homework06;

public class HomeworkNo6 {
    public static void main(String[] args) {
        /*
        Task 1:
        1. Create 2 two-dimensional arrays (matrixes)
        2. Create the 3rd matrix each element of which is the sum of corresponding elements in previous 2 matrixes.
         */

        int[][] arr1 = new int[2][3];
        int[][] arr2 = new int[2][3];

        // Create elements for arr1
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = (int) (Math.random() * 100);
            }
        }

        /*
        Task 2:
        2. Print out the matrix in the following format:
         */
        System.out.println("Elements of arr1:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Line (row): " + i + " ");
            System.out.println("Values: ");
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(" " + arr1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Create elements for arr2
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = (int) (Math.random() * 100);
            }
        }

        /*
        Task 2:
        2. Print out the matrix in the following format:
         */
        System.out.println("Elements of arr2: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Line (row): " + i + " ");
            System.out.println("Values: ");
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(" " + arr2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int index = 0;

        // Count for arr3
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                count = arr1[i][j];
            }
        }
        System.out.println("Elements and value of arr3");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {

                int[] arr3 = new int[count];
                arr3[index] = arr1[i][j] + arr2[i][j];
                System.out.println("arr3["+index + "] = " + (arr3[index]));
                index++;
            }
        }
    }
}
