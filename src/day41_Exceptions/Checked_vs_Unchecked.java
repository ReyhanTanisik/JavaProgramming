package day41_Exceptions;

import day36_Inheritance.encapsulation.Student;

import java.io.File;
import java.io.FileInputStream;

public class Checked_vs_Unchecked {


    public static void main(String[] args) {
        //unchecked exception

        int a=10;
        int b=0;
        // System.out.println(a/b); //arithmetic exception
        // it will terminate our program
        //System.out.println("wooden spoon");// this line will not be executed

       char [] characters={'A','B','C'};
        //System.out.println(characters[99]); // unchecked during the compile time

        Student student=null;
        System.out.println(student.getName()); //null pointer exception


        String str="Wooden spoon";
        str=null;
       // System.out.println(str.toUpperCase());


        //checked option

        System.out.println("Hello");
        //Thread.sleep(3000);  // compiler can check the exception , this is checked exception

        System.out.println("Cydeo");


        //FileInputStream file= new FileInputStream("path of the file");
    }
}
