package SubstringComparison;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution1 {
    public static String getSmallestAndLargest(String s, int k) {
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        List<String> list = new ArrayList<>();

        for(int i =0;i<s.length()-1;i++){
            if(k>s.length()){
                break;
            }
            list.add(s.substring(i,(k++)));
        }
        list = list.stream().sorted().collect(Collectors.toList());

        return list.get(0) + "\n" + list.get(list.size()-1);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
