package day30_CustomClass;

public class Student {

    public String name;
    public char gender;
    public int age;
    public int ID;
    public char grade;

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';


    }

    public void setInfo(String name, char gender, int age, int ID, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.grade = grade;      // when the local and instance variables shares the same name , we must call this. method
    }

    public void code(){
        System.out.println(name +" is coding.");
    }

    public void sleep(){
        System.out.println(name+ " is sleeping.");
    }
}
