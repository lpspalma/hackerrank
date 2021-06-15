package challenge1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        int numCore=4;
        int limit=1;
        long sum =0;

        numbers.add(4);
        numbers.add(1);
        numbers.add(16);
        numbers.add(2);
        numbers.add(8);

        List<Integer> max = numbers.stream().sorted().filter(x -> x%numCore==0).collect(Collectors.toList());
        int size = limit - max.size();
        if (size<0){
            size=size*-1;
            while (size-1>=0){
                max.remove(size-1);
                size--;
            }
        }
        for(int i: numbers){
            if(max.contains(i)){
                sum+=i/numCore;
            }else {
                sum+=i;
            }
        }
        System.out.println(sum);

    }
}
