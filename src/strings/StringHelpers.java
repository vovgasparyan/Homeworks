// 1. create a separate package named 'strings', in this package
package strings;

// 2. Create a class named StringHelpers. This class has one field named stringUnderTest of type String.
public class StringHelpers {

    public String stringUnderTest;

    // 3. In this class add the following methods:
    // 3.1) check if the stringUnderTest is palindrome
    public void checkPalindrome() {
        StringBuilder stringBuilderStr = new StringBuilder(this.stringUnderTest);

        if (this.stringUnderTest.equalsIgnoreCase(stringBuilderStr.reverse().toString())) {
            System.out.println(this.stringUnderTest + " is a palindrome.");
        } else {
            System.out.println(this.stringUnderTest + " is not a palindrome.");
        }

    }

    // 3.2) check how many 'a' symbols are there in the stringUnderTest
    public void checkSymbol() {
        int sumSymbol = 0;
        for (int i = 0; i < this.stringUnderTest.length(); i++) {
            if (this.stringUnderTest.charAt(i) == 'a') {
                sumSymbol++;
            }
        }
        if (sumSymbol > 1) {
            System.out.println("In " + this.stringUnderTest + " string are " + sumSymbol + " 'a' symbols.");
        } else {
            System.out.println("In " + this.stringUnderTest + " string is " + sumSymbol + " 'a' symbol.");
        }
    }

    // 3.3) check if the stringUnderTest contains % sign (do not use contains method)
    public void containsSymbol() {
        String res = "";
        for (int i = 0; i < this.stringUnderTest.length(); i++) {
            if (this.stringUnderTest.charAt(i) == '%') {
                res = this.stringUnderTest + " is contains % sign";
                break;
            } else {
                res = this.stringUnderTest + " is not contains % sign";
            }
        }
        System.out.println(res);
    }

    //  3.4) check if the stringUnderTest's length is bigger than or equals to 5.
    public void checkLength() {
        if (this.stringUnderTest.length() == 5) {
            System.out.println("The " + this.stringUnderTest + " length is equals to 5");
        } else if (this.stringUnderTest.length() > 5) {
            System.out.println("The " + this.stringUnderTest + " length is bigger than 5");
        } else {
            System.out.println("The " + this.stringUnderTest + " length is smaller than 5");
        }
    }
}
