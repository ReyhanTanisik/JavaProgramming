package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(list);

        list.removeAll(Arrays.asList(3, 5, 7)); // if I have multiple time 3,5,7 they will all be removed
        System.out.println(list);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(100, 200, 300, 400, 500, 100, 200, 300, 500, 800));
        System.out.println(numbers);
        numbers.retainAll(Arrays.asList(100, 200, 300));// all the unmatching ones are removed
        System.out.println(numbers);

        ArrayList<String> jobTitles = new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA", "SDET", "Developer", "Scrum Master", "BA", "BA", "QA", "SDET"));
        jobTitles.retainAll(Arrays.asList("QA", "SDET"));
        System.out.println(jobTitles);

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        boolean r1 = nums.contains(10);
        boolean r2 = nums.contains(2) & nums.contains(5) & nums.contains(10);
        System.out.println(r1);
        System.out.println(r2);

        boolean r3 = nums.containsAll(Arrays.asList(2, 5, 10)); // if one of them is not contained , it will return me false
        System.out.println(r3);


        String[] names = {"Reyhan", "Cengiz", "Mirza", "İbrahim"};
        ArrayList<String> nameList = new ArrayList<>(Arrays.asList(names));

        // nameList.addAll(Arrays.asList(names));

        System.out.println(nameList);
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArrayList<Integer> list2 = new ArrayList<>((Arrays.asList(arr)));
        System.out.println(list2);


        int [] arr2= {1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> list3= new ArrayList<>( convertArrayToArrayList(arr2));
        System.out.println(list3);

    }


    public static ArrayList<Integer> convertArrayToArrayList(int[] array) {

        ArrayList<Integer> list= new ArrayList<>();
        for (int each : array) {
            list.add(each);
            
        }
        return list;

    }
}