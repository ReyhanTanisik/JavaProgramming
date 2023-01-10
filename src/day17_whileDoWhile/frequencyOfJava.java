package day17_whileDoWhile;

public class frequencyOfJava {
    public static void main(String[] args) {
        String str="JavaJavaJava.";
        String j="Java";
        int l=str.length();
        int frequency=0;
        for (int i = 0; i < l-3; i++) {
          if( j.equals(str.substring(i,i+4))){
              frequency+=1;
          }


        }

        System.out.println(frequency);


        }
    }

