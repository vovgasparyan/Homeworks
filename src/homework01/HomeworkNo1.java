package homework01;

/*
Points 1. and 2. were created programmatically
1. Create a new Java project in IntelliJ IDEA. Name it 'homework'
2. In the 'src' folder create a new Java class named 'homework01.HomeworkNo1'
 */
public class HomeworkNo1 {
    /*
    3. Create the main method as shown in the class.
    */
    public static void main(String[] args) {

        /*
        4. Print 'Hello' on screen and then print your name on a separate line
         */
        System.out.println("Hello");
        System.out.println("Vladimir");

        /*
        5. Calculate and print the sum of two numbers, save the results in a variables: 76+1190, 834+2791
         */
        short a = 76;
        short b = 1190;
        int result_ab = a + b;
        System.out.println("Sum of a + b = " + result_ab);

        short c = 834;
        short d = 2791;
        int result_cd = c + d;
        System.out.println("Sum of c + d = " + result_cd);

        /*
        6. Divide two numbers and print the result, save the results in a variables: 246/5,  1005/28
         */

        float e = 246f;
        float f = 5f;
        float result_division_ef = e / f;
        System.out.println("Division e / f = " + result_division_ef);

        float g = 1005f;
        float h = 28f;
        float result_division_gh = g / h;
        System.out.println("Division g / h = " + result_division_gh);

        /*
        7. Print the result of the following operations, save the results in a variable:
        1) -5 + 8 * 6,
        2) (55+9) % 9,
        3) 20 + -3*5 / 8,
        4) 5 + 15 / 3 * 2 - 8 % 3
         */

        // 1)
        byte a1 = -5;
        byte b1 = 8;
        byte c1 = 6;
        int result_of_1 = a1 + b1 * c1;
        System.out.println("Result of 1) is -: " + result_of_1);

        // 2)
        byte a2 = 55;
        byte b2 = 9;
        int result_of_2 = (a2 + b2) % b2;
        System.out.println("Result of 2) is -: " + result_of_2);

        // 3)
        byte a3 = 20;
        float b3 = -3f;
        byte c3 = 5;
        byte d3 = 8;
        float result_of_3 = a3 + b3 * c3 / d3;
        System.out.println("Result of 3) is -: " + result_of_3);

        //4) 5 + 15 / 3 * 2 - 8 % 3
        byte a4 = 5;
        byte b4 = 15;
        byte c4 = 3;
        byte d4 = 2;
        byte e4 = 8;
        int result_of_4 = a4 + b4 / c4 * d4 - e4 % c4;
        System.out.println("Result of 4) is -: " + result_of_4);

        /*
        8. Print your name in Armenian letters using char variables and use Unicode codes for each letter.
         */
        char ch1 = '\u054E';
        char ch2 = '\u056c';
        char ch3 = '\u0561';
        char ch4 = '\u0564';
        char ch5 = '\u056B';
        char ch6 = '\u0574';
        char ch7 = '\u056B';
        char ch8 = '\u0580';
        System.out.println("My name is " + ch1 + ch2 + ch3 + ch4 + ch5 + ch6 + ch7 + ch8);
    }
}