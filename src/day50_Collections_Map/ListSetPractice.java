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


        // pop() ==> LIFO
        List<Character> chars = new Stack<>();
        chars.addAll(Arrays.asList('A', 'B', 'C', 'D'));

        System.out.println("chars = " + chars); //[A, B, C, D]

        (  (Stack)chars ).pop();

        System.out.println("chars = " + chars); //[A, B, C]


        //poll() ==> FIFO

        List<String> names2 = new LinkedList<>();
        names.addAll(Arrays.asList("James", "Jimmy", "Kathy", "Breanna", "Max"));

        System.out.println(names);

        ((LinkedList<String>) names2).poll();

        System.out.println(names2);

        ((LinkedList<String>) names2).poll();

        System.out.println(names2);









    }
}
