package day32_Constructors;

public class EmployeeObjects {

    public static void main(String[] args) {
        Employee employee1= new Employee("Aaron");

        System.out.println(employee1);

        Employee employee2= new Employee("Ali",'M');
        System.out.println(employee2);

         Employee employee3= new Employee("Reyhan",'F',"SDET");
        System.out.println(employee3);
    }

}
