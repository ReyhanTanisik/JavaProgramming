package day29_ArrayList;

import utilities.StringUtilities;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,8,9));


       /* for (int i = 0; i < list.size(); i++) {
            if (list.get(i)%2!=0){
                list.remove(i);
            }
            
        }
        System.out.println(list);
*/

        list.removeIf(p-> p<5); // basic syntax of Lambda expression
        System.out.println(list);


        ArrayList <Integer > list2= new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list2.removeIf(each -> each%2 ==0);

        System.out.println(list2);

        ArrayList< String> list3= new ArrayList<>();
        list3.addAll(Arrays.asList("Java","Python","JavaScript","C#","C++","Java","Java"));
        list3.removeIf(p->p.startsWith("J")); // we removed all the strings which starts with J
        System.out.println(list3);

        ArrayList<String> names= new ArrayList<>();
        names.addAll(Arrays.asList("Anna","Ali","Talat","Feyza"));
        names.removeIf(name-> !StringUtilities.isPalindrome(name));
        System.out.println(names);

    }
}
