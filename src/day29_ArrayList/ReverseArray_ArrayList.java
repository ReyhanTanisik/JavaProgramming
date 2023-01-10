package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArray_ArrayList {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6};

        int[] result= new int[arr.length];
        int j=0;
        for (int i = arr.length - 1; i >= 0; i--) {
            result[j++]=arr[i];

        }
        System.out.println(Arrays.toString(result));


        ArrayList <Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7));
        ArrayList<Integer> result2= new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {

            int each= list.get(i);
            result2.add(each);

        }

        System.out.println(result2);
    }
}
