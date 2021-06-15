package Anagram;

import java.util.Scanner;

public class Solution2 {
    static boolean isAnagram(String A, String B) {
        int NO_OF_CHARS = 256;
        A = A.toLowerCase();
        B = B.toLowerCase();

        char[] str1 = A.toCharArray();
        char[] str2 = B.toCharArray();

        int[] count1 = new int[NO_OF_CHARS];
        int[] count2 = new int[NO_OF_CHARS];
        for(int c=0; c<NO_OF_CHARS; c++){
            count1[c] = 0;
            count2[c] = 0;
        }

        int i;
        for (i = 0; i < str1.length && i < str2.length; i++) {
            count1[str1[i]]++;
            count2[str2[i]]++;
        }

        if (str1.length != str2.length)
            return false;

        for (i = 0; i < NO_OF_CHARS; i++)
            if (count1[i] != count2[i])
                return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

}
