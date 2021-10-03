package strings;

public class StringUsage {

    public static void main(String[] args) {

        StringHelpers obj = new StringHelpers();
        obj.stringUnderTest = "Vladimir";

        System.out.println("Method 1:");
        obj.checkPalindrome();

        System.out.println("\nMethod 2:");
        obj.checkSymbol();

        System.out.println("\nMethod 3:");
        obj.containsSymbol();

        System.out.println("\nMethod 4:");
        obj.checkLength();
    }
}
