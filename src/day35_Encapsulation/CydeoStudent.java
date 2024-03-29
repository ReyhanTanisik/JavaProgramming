package day35_Encapsulation;

public class CydeoStudent {
    public String name;
    public char gender;
    public int age;
    public int batchNumber;
    public int groupNumber;
    public static String schoolName;
    public String fieldOfStudy;
    public static String programmingLanguage;
    public static String secretCode;



    static{
        schoolName="Cydeo";
        programmingLanguage="Java";
        secretCode="Wooden Spoon";

    }


    public static void printSchoolName(){
        System.out.println("The school name is "+schoolName);
    }

    public static void printProgrammingLanguage(){
        System.out.println("The programming language is "+programmingLanguage);
    }

    public static void printSecretCode(){
        System.out.println("The secret code is "+secretCode);
    }

    public void attendClass() {
        System.out.println(name + " is attending class. ");
    }

    public void study() {
        System.out.println(name + " is studying.");
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", school='" + schoolName + '\'' +
                ", programming language='" + programmingLanguage + '\'' +
                '}';
    }






}
