package javaIntToString;

import java.util.*;
import java.security.*;
public class Solution {
    public static void main(String[] args) {

        try {
            Scanner in = new Scanner(System.in);
            int n = in .nextInt();
            in.close();
            //String s=???; Complete this line below
            String s = String.valueOf(n);

            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            }
        } catch (Exception e) {
            System.out.println("Wrong answer.");
        }
    }
}



