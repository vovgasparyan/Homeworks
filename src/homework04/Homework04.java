package homework04;

import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {
        /*
        1. Using 'while' iteration statement and Scanner class, calculate the arithmetic average of all the even
        numbers up until the input number.
         */
        System.out.println("*** Homework N4 exercise 1 ***");
        Scanner inputScan = new Scanner(System.in);

        System.out.println("Enter the number:");
        int valueScan = inputScan.nextInt();
        int i = 0;
        int arithmetic = 0, inputNumCount = 0;

        while (i <= valueScan) {
            if (i % 2 == 0) {
                arithmetic += i;
                inputNumCount++;
            }
            i++;
        }
        System.out.println("Arithmetic average of input number is: " + (arithmetic / inputNumCount));


        /*
        2. Print first 16 numbers but skip ones that are divisible by 3
         */
        System.out.println("*** Homework N4 exercise 2 ***");
        int a = 16;

        for (int j = 0; j < a; j++) {
            if (j % 3 == 0) {
                continue;
            }
            System.out.println(j);
        }


        /*
        3. Read 5 integer numbers from console and print the sum of those numbers.
         */
        System.out.println("*** Homework N4 exercise 3 ***");
        int countFive;
        int k = 1;
        int summaryOfNumbers = 0;
        System.out.println("Enter 5 integer numbers");
        do {
            // using inputScan from exercise 1
            countFive = inputScan.nextInt();
            summaryOfNumbers += countFive;
            k++;
        }
        while (k <= 5);
        System.out.println("Summary of your entered numbers : " + summaryOfNumbers);


        /*
        4. Read an integer from console and print the cube of each number up until that number.
         */
        System.out.println("*** Homework N4 exercise 4 ***");
        System.out.println("Enter the number:");
        // using inputScan from exercise 1
        int numberScan = inputScan.nextInt();
        for (int m = 1; m < numberScan; m++) {
            System.out.println("Cube of " + m + " is: " + (m * m * m));
        }
    }

}
