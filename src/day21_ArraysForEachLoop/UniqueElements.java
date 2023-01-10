package day21_ArraysForEachLoop;

public class UniqueElements {
    public static void main(String[] args) {
        String[] names= { "Ali","Kalbinur","Reyhan","Reyhan","Ali"};


        for (String name : names) {

            int count=0;
            for (String element : names) {
                if( element.equals(name)){
                    count++;
                }

            }
            if (count==1){
                System.out.println(name);
            }

        }


    }
}
