package day15_ForLoop;

import java.util.Scanner;

public class startsWithX {
    public static void main(String[] args) {
        System.out.println("Enter a word:");
        String word=new Scanner(System.in).next(); // because we will use it just for one time
        if(word.charAt(0)=='x'){
            word=word.replaceFirst("x","a");
            System.out.println(word);
        }
    }
}
