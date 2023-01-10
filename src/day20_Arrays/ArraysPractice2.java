package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice2 {
    public static void main(String[] args) {
        char[]letters=new char[26];
        for (char i = 'A',j=0; i <= 'Z'&& j<26; i++,j++) {
           letters[j]=i;
        }
        System.out.println(Arrays.toString(letters));


        char ch='A';
        for (int i = 0; i <26 ; i++) {
            letters[i]=ch++;

        }
        System.out.println(Arrays.toString(letters));


        char[] letters2=new char[26];

        for (char i = 'Z',j=0; i >='A'&& j<26 ; i--,j++) {
            letters2[j]=i;

        } System.out.println(Arrays.toString(letters2));

    }
}
