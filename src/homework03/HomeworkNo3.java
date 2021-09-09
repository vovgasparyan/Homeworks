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
        double firstValue = inputValue.nextDouble();

        System.out.println("Enter operator using \"a\" or \"s\" or \"m\" or \"d\" chars\n a - add, s - subtract, " +
                "m - multiply, d - divide");
        String inputOperator = inputValue.next();

        System.out.println("Enter second value");
        double secondValue = inputValue.nextDouble();
        double result;
        switch (inputOperator) {
            case "a":
                result = firstValue + secondValue;
                System.out.println("Result of add is " + result);
                break;
            case "s":
                result = firstValue - secondValue;
                System.out.println("Result of subtract is " + result);
                break;
            case "m":
                result = firstValue * secondValue;
                System.out.println("Result of multiply is " + result);
                break;
            case "d":
                if (secondValue == 0) {
                    System.out.println("Error divide on 0");
                } else {
                    result = firstValue / secondValue;
                    System.out.println("Result of divide is " + result);
                }
                break;
            default:
                System.out.println("Invalid operator:\nEnter operator using \"a\" or \"s\" or \"m\" or \"d\"");
        }
    }
}