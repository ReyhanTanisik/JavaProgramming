package day20_Arrays;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {
        char[] alphabets= new char[26]; // mandatory to put the size
        char ch='Z';
        for (int i = 0; i <26 ; i++,ch--) {
            alphabets[i]=ch;

        }
        System.out.println(Arrays.toString(alphabets));



    }
}
