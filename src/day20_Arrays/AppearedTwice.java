package day20_Arrays;

public class AppearedTwice {
    public static void main(String[] args) {
        char[] chars={'A','A','C','D','J','K'};

        for (int j = 0; j < chars.length; j++) {


            char ch=chars[j];
            int frequency=0;

            for (int i = 0; i < chars.length; i++) {
                if (ch==chars[i]){
                    frequency++;
                }

            }
            if (frequency==2){
                System.out.println(ch);


            }


        }





    }
}
