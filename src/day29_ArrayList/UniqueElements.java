package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,2,2,3,4,5,67,4,5,6,8,9));
        ArrayList<Integer> unique= new ArrayList<>();
        for (Integer each : list) {
           int frequency= Collections.frequency(list,each);
           if (frequency==1){
               unique.add(each);
           }

        }
        System.out.println(unique);


        ArrayList<Integer> list2= new ArrayList<>();
        list2.addAll(Arrays.asList(1,1,1,2,2,3,4,5,67,4,5,6,8,9));
        ArrayList<Integer> unique2= new ArrayList<>(list2);
        unique2.removeIf(p-> Collections.frequency(list2,p)>1);
        System.out.println(unique2);



    }
}
