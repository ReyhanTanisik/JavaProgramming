package day34_GarbageCollection_AccessModifiers;

public class CydeoStudent {

    public String studentName;
    public static String schoolName="Cydeo";
    public CydeoStudent(String studentName){
        this.studentName=studentName;

    }

}
   class CydeoStudentObjects{
       public static void main(String[] args) {
        CydeoStudent student1= new CydeoStudent("Reyhan");
        CydeoStudent student2= new CydeoStudent("Nur");
           System.out.println(student1.schoolName);
       }
   }
