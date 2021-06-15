package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SolutionIPValidation {
    /* ReGex to numbers from 0 to 255
    zeroTo255 -> (\\d{1, 2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])

    ReGex to validate complete IP address
    IPAddress -> zeroTo255 + "\\." + zeroTo255
                + "\\." + zeroTo255
                + "\\." + zeroTo255;
    \d represents digits in regular expressions, same as [0-9]
    \\d{1, 2} catches any one or two-digit number
    (0|1)\\d{2} catches any three-digit number starting with 0 or 1.
    2[0-4]\\d catches numbers between 200 and 249.
    25[0-5] catches numbers between 250 and 255.

     */

    public static boolean isValidIPAddress(String ip) {
        String zeroTo255 = "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])";

        String regex
                = zeroTo255 + "\\."
                + zeroTo255 + "\\."
                + zeroTo255 + "\\."
                + zeroTo255;

        // Compile the ReGex
        Pattern p = Pattern.compile(regex);
        if (ip == null) {
            return false;
        }

        Matcher m = p.matcher(ip);
        return m.matches();
    }

    public static void main(String args[]) {
        // Test Case: 1
        System.out.println("Test Case 1:");
        String str1 = "000.12.12.034";
        System.out.println("Input: " + str1);
        System.out.println("Output: " + isValidIPAddress(str1));

        // Test Case: 2
        System.out.println("\nTest Case 2:");
        String str2 = "121.234.12.12";
        System.out.println("Input: " + str2);
        System.out.println("Output: " + isValidIPAddress(str2));

        // Test Case: 3
        System.out.println("\nTest Case 3:");
        String str3 = "000.12.234.23.23";
        System.out.println("Input: " + str3);
        System.out.println("Output: " + isValidIPAddress(str3));

        // Test Case: 4
        System.out.println("\nTest Case 4:");
        String str4 = "I.Am.not.an.ip";
        System.out.println("Input: " + str4);
        System.out.println("Output: " + isValidIPAddress(str4));
    }

}
