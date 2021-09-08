package homework03;
/*
1. Create a calculator using Scanner:
Read the 2 numbers from input stream with Scanner, save the values in variables.
Read a character from the input stream to decide the operation in the following way:
      a - add, s - subtract, m - multiply, d - divide.
Write the logic of calculator using switch-case and input character for the operation.
Print out the result of the operation using System.out.println();
Don't forget to take into consideration the case when user can provide incorrect data:
      for example user wants to divide by 0 or provides 'b' as an operation.
 */



import java.util.Scanner;

public class HomeworkNo3 {

    public static void main(String[] args) {

        Scanner inputValue = new Scanner(System.in);

        System.out.println("Enter first value");
        int firstValue = inputValue.nextInt();

        System.out.println("Enter operator using \"a\" or \"s\" or \"m\" or \"d\" chars\n a - add, s - subtract, " +
                "m - multiply, d - divide");
        char inputOperator = inputValue.next().charAt(0);

        System.out.println("Enter second value");
        int secondValue = inputValue.nextInt();

        switch (inputOperator) {
            case 'a':
                int result = firstValue + secondValue;
                System.out.println("result is " + result);
                break;
            default:
                System.out.println("Invalid operator: enter operator using \"a\" or \"s\" or \"m\" or \"d\" chars");
        }
        // остановился на плюсе

    }

}