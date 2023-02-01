package day50_Collections_Map;

import java.util.*;

public class ListSetPractice {

    public static void main(String[] args) {


        Set<Integer > set=new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));// duplicated elements are not allowed in set
        System.out.println(set);

        List<Integer> list =new ArrayList<>(set); // we use constructor of arraylist to convert set to arraylist
        System.out.println(list);

        List<String> names= null;


    }
}
