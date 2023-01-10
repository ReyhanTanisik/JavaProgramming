package day21_ArraysForEachLoop;

public class AverageNum {
    public static void main(String[] args) {
        int[] nums={10,20,30,40,50,60,70};
        double sum=0;

        for (int numbers : nums) {
            sum +=numbers;
            
        }
        double average= sum/ nums.length;
        System.out.println(average);
    }
    
}
