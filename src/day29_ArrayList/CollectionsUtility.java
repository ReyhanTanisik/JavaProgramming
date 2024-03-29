package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {
        ArrayList <Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(10,9,8,7,6,5,4,3,2,1));
        Collections.sort(list);
        System.out.println(list);

        ArrayList<Character> list2= new ArrayList<>();
        list2.addAll(Arrays.asList('A','B','C','D','E'));
        Collections.reverse(list2);
        System.out.println(list2);

        ArrayList<Integer> list3= new ArrayList<>();
        list3.addAll(Arrays.asList(10,20,30,40,50,60));
        Collections.swap(list3,1,4);
        System.out.println(list3);

        int max=Collections.max(list3);
        int min= Collections.min(list3);

        System.out.println("min = " + min);
        System.out.println("max = " + max);

        ArrayList<Integer> list4= new ArrayList<>();
        list4.addAll(Arrays.asList(10,10,20,20,30,30,40,40,50,60));
        Collections.replaceAll(list4,10,1000);
        System.out.println(list4);


        int frequency=Collections.frequency(list4,1000);
        System.out.println(frequency);


        ArrayList<String> words= new ArrayList<>();
        words.addAll(Arrays.asList("Java","Python","C++","Python","Java","Ruby"));
        int countJava= Collections.frequency(words,"Java");
        int countPython= Collections.frequency(words,"Python");

        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);








    }
}
