package day21_ArraysForEachLoop;

public class İnitials {
    public static void main(String[] args) {
        String[] names= { "Cydeo School","Manual Testing","Wooden Spoon","Selenium Automation","SQL Programming"};

        for(String each : names){
            String initial= each.charAt(0)+"."+each.charAt(each.indexOf(" ")+1);
            System.out.println(initial);
        }
    }
}
