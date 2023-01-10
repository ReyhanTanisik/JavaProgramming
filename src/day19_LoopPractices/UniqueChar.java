package day19_LoopPractices;

public class UniqueChar {
    public static void main(String[] args) {

        String s="aabbcdddef";

        String result="";
        for (int j = 0; j <s.length() ; j++) {
            char ch=s.charAt(j);
            int count=0;

            for (int i = 0; i <s.length() ; i++) {
                char each=s.charAt(i);
                if (ch==each){
                    count ++;
                }

            }
            if (count==1){
                result+=ch;
            }

        }

        System.out.println(result);

    }
}
