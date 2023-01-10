package day19_LoopPractices;

public class FrequencyOfChar {
    public static void main(String[] args) {
        String s="aabcccdd";
        String result="";


        for (int j = 0; j < s.length(); j++) {
            int count=0;
            char ch= s.charAt(j);

            for (int i = 0; i <s.length() ; i++) {
                char each= s.charAt(i);
                if (ch==each){
                    count++;

                }

            }

            if(result.contains(ch+"")){
                continue;
            }

            result+=ch;
            result+=count;


        }

        System.out.println(result);
    }
}
