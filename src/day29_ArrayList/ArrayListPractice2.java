package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractice2 {
    public static void main(String[] args) {
        ArrayList<String> employees= new ArrayList<>();
        employees.addAll(Arrays.asList("Ali","Reyhan","Ahmet","David","Deniz"));
        employees.retainAll(Arrays.asList("Ahmet","David")); // all the unmatching elements will be removed
        System.out.println(employees);

        String [] names={"Maria","Meryem","Reyhan","Mehmet","Sumeyra","Seyma"};
        ArrayList<String> list= new ArrayList<>(Arrays.asList(names));
        list.removeIf(p->p.startsWith("M"));
        System.out.println(list);
        names=list.toArray(new String [0]);
        System.out.println(Arrays.toString(names));
    }
}
