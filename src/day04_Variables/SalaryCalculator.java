package day04_Variables;

public class SalaryCalculator {
    public static void main(String[] args) {
        // hourlyRate , weeklyHours
        int hourlyRate = 65;
        int weeklyHour = 45;
        int salary = hourlyRate * weeklyHour * 52;
       // System.out.println(salary);
        System.out.println("hourlyRate = $" + hourlyRate);
        System.out.println("weeklyHour = " + weeklyHour);
        System.out.println("salary = $" + salary);
    }

}
