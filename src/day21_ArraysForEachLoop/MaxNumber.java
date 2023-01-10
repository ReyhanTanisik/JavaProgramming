package day21_ArraysForEachLoop;

public class MaxNumber {
    public static void main(String[] args) {

        int [] numbers= {21,41,23,123,56,12};
        int max= numbers[0];

        for (int number : numbers) {
            if (number>max){
                max=number;
            }



        }
        System.out.println(max);

    }
}
