package day15_ForLoop;

public class FormatFullName {
    public static void main(String[] args) {
        String firstName="cYdeo";
        String lastName="sCHOOL";
       firstName= firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
       lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
        System.out.println(firstName);
        System.out.println(lastName);
    }
}
