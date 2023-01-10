package day05concatenation;

public class FullName {
    public static void main(String[] args) {
        String firstName = "Reyhan";
        String lastName = " Tanişik";
        String fullName = firstName+ lastName;
        System.out.println(firstName + lastName);
        System.out.println(fullName);
        System.out.println("Full name of the person is " +fullName +".");
        int age = 31;
        System.out.println(fullName+ " is "+ age+ " years old.");
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;
        System.out.println(fullName + " is " + jobTitle + " at " + companyName +" and " +fullName + "'s salary is " + salary+".");

    }
}
