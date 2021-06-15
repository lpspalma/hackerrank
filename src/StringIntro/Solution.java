package StringIntro;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        System.out.println(A.length() + B.length());

        if(A.compareTo(B)>0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        A= A.replace(A.charAt(0),A.toUpperCase().charAt(0));
        B= B.replace(B.charAt(0),B.toUpperCase().charAt(0));
        System.out.println(A+" "+B);
    }
}
