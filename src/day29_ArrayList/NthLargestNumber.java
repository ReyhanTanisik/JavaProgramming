package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class NthLargestNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(10,30,47,23,67,12,11,98));
        
        int n=3;
        for (int i = 0; i < n; i++) {
            list.removeIf(p-> Collections.max(list)==p);
        }

       
        int max=  Collections.max(list);
        System.out.println(max);

    }
}
