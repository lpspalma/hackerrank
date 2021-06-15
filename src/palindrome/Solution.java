package palindrome;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        char[] newA = new char[A.length()];

        for(int i = 0; i<=A.length()-1; i++){
           newA[(A.length()-1)-i] = A.charAt(i);
        }

        if(String.valueOf(newA).equals(A)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }

}
