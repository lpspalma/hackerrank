package SubstringComparison;

import java.util.Scanner;

public class Solution2 {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
        for(int i =1;i<s.length();i++){
            if(k>s.length()){
                break;
            }
            if(smallest.compareTo(s.substring(i,(k++)))>=0){
                smallest = s.substring(i,(k++));
            }
            if(largest.compareTo(s.substring(i,(k++)))<=0){
                largest = s.substring(i,(k++));
            }
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
