package Homework05;

/*
Create a class named InsertionSortAlgorithm
 */
public class InsertionSortAlgorithm {
    public static void main(String[] args) {

        /*
        1) declare an array of type int and 15 elements
         */
        int[] arr = new int[15];

        /*
        2) Generate random values for elements of the array using the Math.random() method and for cycle
         */
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        /*
        3) Print out the values of the elements in the unsorted array
         */
        System.out.println("Unsorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        /*
        4) provide the implementation algorithm to sort the given array
         */

                                             // comment about the purpose of code-chunk

        int temp;                            // create a temporary variable
        int i = arr.length - 1;              // array length

        while (i >= 0) {                     // create a loop to check each element

            int lastVal = arr[i];            // create variable for last element of array
            int arrElem = i;                 // create variable for each element
            int j = i - 1;                   // create a variable for comparing elements

            while (j >= 0) {                 // create a loop to comparing elements
                if (arr[j] > lastVal) {      // create a check for comparison
                    lastVal = arr[j];        // if the condition is true, then I assign the value to the variable
                    arrElem = j;
                }

                j--;                         // decrement the value by one
            }

            temp = arr[i];                   // assign the value to the variable and elements
            arr[i] = lastVal;
            arr[arrElem] = temp;

            i--;
        }
        System.out.println();                // for break lines

        /*
        5) Print out the values of the elements in the sorted array.
         */
        System.out.println("Array after sorting:");
        for (int j = 0; j < arr.length; j++) {
            System.out.println("arr[" + j + "] = " + arr[j]);
        }

    }
}