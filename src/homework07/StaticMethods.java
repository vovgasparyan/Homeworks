package homework07;

public class StaticMethods {

    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 14;
        int result1 = sum(num1, num2);
        System.out.println("Task 1:\nThe sum of num1 and num2 = " + result1);

        long num3 = 1024;
        System.out.println("\nTask 2:\nThe volume of num3 = " + volume(num3));

        String name = "Vladimir";
        System.out.println("\nTask 3:");
        middleChar(name);

        int[] myArray1 = new int[10];
        System.out.print("\n\nTask 4:\nArray values: ");
        randArray(myArray1);

        String[] myArray2 = {"Airbus", "Boeing", "McDonnellDouglas", "Lockheed", "Yakovlev"};
        System.out.println("\n\nTask 5:\nString array:");
        stringArray(myArray2);
    }

    // 1. a static method to calculate and return the sum of parameters
    public static int sum(int x, int y) {
        return x + y;
    }

    // 2. a static method to calculate and return the cube of the product of arguments.
    public static long volume(long x) {
        return x * x * x;
    }

    // 3. a static method to print out the middle character of the String parameter
    public static void middleChar(String str) {
        int middleStringChar = str.length() / 2;
        System.out.print("The middle character of \"" + str + "\" is: " + str.charAt(middleStringChar));
    }

    // 4. a static method that takes as a parameter an int[] array and initializes it with random numbers.
    public static void randArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        for (int elem : array) {
            System.out.print(elem + " ");
        }
    }

    // 5. a static method that takes as a parameter a String[] array and prints the values in it: each value on a new line.
    public static void stringArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("arr[" + i + "] = " + array[i]);
        }
    }
}