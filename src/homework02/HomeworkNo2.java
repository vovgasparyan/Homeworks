package homework02;

public class HomeworkNo2 {

    public static void main(String[] args) {
        /*
        1. Declare 2 variables of a numerical type of your preference. Check if the first one is a) bigger than,
           b) less than anc c) equals to the second one. Print out the following for each case: a) Firs is bigger,
           b) First is smaller, c) They are equal
         */
        int a = 10;
        int b = 5;
        if (a > b)
            System.out.println("First is bigger");
        else if (a < b)
            System.out.println("First is smaller");
        else
            System.out.println("They are equal");


        /*
        2. Declare 3 char variables, print out the value of the variable which alphabetically comes the last.
         */
        char letterR = 'R';
        char letterT = 'T';
        char letterV = 'V';
        if (letterR > letterT) {
            System.out.println("R is last from selected letters");
        } else if (letterT > letterV) {
            System.out.println("T is last from selected letters");
        } else {
            System.out.println("V is last from selected letters");
        }
        


        /*
        3. Suppose we have a car crash with 2 cars: the red and the black. Declare 2 boolean variables:
        redIsHitFromBehind and blackIsHitFromBehind. Check the possible cases and print out the color of the car
        that is guilty for the crash. If both values are true or both are false, print "Invalid state".
        (Use && and || operators)
         */
        boolean redIsHitFromBehind = true;
        boolean blackIsHitFromBehind= false;
        if (redIsHitFromBehind && blackIsHitFromBehind || !redIsHitFromBehind &&
                !blackIsHitFromBehind) {
            System.out.println("Invalid state");
        }
        else if (redIsHitFromBehind && !blackIsHitFromBehind) {
            System.out.println("The red car is guilty for the crash");
        }
        else {
            System.out.println("The black car is guilty for the crash");
        }
    }
}
