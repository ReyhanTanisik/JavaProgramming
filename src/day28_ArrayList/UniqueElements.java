package day28_ArrayList;

import java.util.ArrayList;

public class UniqueElements {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Java");
        list.add("C++");
        list.add("C#");
        list.add("Python");
        list.add("Ruby");
        list.add("C++");
        list.add("Python");

        System.out.println(list);
        
        ArrayList<String> unique= new ArrayList<>();
        for (String each : list) {//shortcut  for each loop "list.for"
            if (list.indexOf(each)== list.lastIndexOf(each)){
                unique.add(each);

            }
            
        }
        System.out.println(unique);
    }
}
