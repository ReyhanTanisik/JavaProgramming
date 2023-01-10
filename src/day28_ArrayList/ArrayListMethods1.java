package day28_ArrayList;


import java.util.ArrayList;

public class ArrayListMethods1 {

    public static void main(String[] args) {
        ArrayList <Integer> numbers= new ArrayList<>();
        numbers.add(10); // autoboxing implicitly
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        numbers.add(2,25); // inserting function
        numbers.add( 5,45);
        System.out.println(numbers);

        System.out.println(numbers.size());
        int lastIndex= numbers.size()-1;
        System.out.println("lastIndex = " + lastIndex);

        int num= numbers.get(3);
        System.out.println("num = " + num);

        for (int i = 0; i <numbers.size() ; i++) {
            System.out.println(numbers.get(i));

        }


        ArrayList<String> list= new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C#");
        list.add("Ruby");
        list.set(2,"JavaScript"); // replace the element at the given index with the new element
        list.set(3,"C++");
        System.out.println(list);

        ArrayList<String> employees= new ArrayList<>();
        employees.add("Reyhan");
        employees.add("Ali");
        employees.add("Hulya");
        employees.add("Mehmet");
        employees.add("Selin");
        employees.add("Sevde");
        employees.add("Omer");
        employees.add("Mahmut");
        System.out.println(employees);

        employees.remove(0);
        System.out.println(employees);

        employees.remove(0);
        System.out.println(employees);
        boolean r1= employees.remove("Mahmut"); // we can assign to a boolean variable to be sure if the operation was successfull or not
        System.out.println(employees);
        System.out.println(r1);

    }
}
