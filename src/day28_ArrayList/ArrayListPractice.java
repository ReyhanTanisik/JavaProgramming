package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i)*2); // each element is replaced by their double.
        }
        System.out.println(list);


        ArrayList<Integer> list1= new ArrayList<>();

        Integer a=1;
        System.out.println(list1.remove(a));



    }
}
