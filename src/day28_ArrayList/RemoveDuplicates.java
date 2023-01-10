package day28_ArrayList;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList <Integer> list=new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(30);
        ArrayList<Integer> result= new ArrayList<>();
        for (Integer each : list) {
            if (result.contains(each)){
                continue;
            }
           result.add(each);
        }
        System.out.println(result);

        ArrayList<Integer> list1= new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();


        list1.add(100);
        list1.add(100);
        list1.add(100);


        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1==list2); // false
        System.out.println(list1.equals(list2)); // true , if they have same elements equals method will return true

        list1.clear();
        boolean r1= list1.isEmpty();
        System.out.println(r1);

        ArrayList<Integer>  numbers= new ArrayList<>();
        numbers.addAll(Arrays.asList(1,22,3,4,4,5,5,56,77,8));
        System.out.println(numbers);
    }
}
