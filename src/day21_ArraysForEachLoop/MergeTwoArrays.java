package day21_ArraysForEachLoop;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {6, 7, 8};

        int[] nums3 = new int[nums1.length + nums2.length];

        int i=0;
        for (int each: nums1){
            nums3[i++]=each;
        }
        for (int each:nums2){
            nums3[i++]=each;
        }
        System.out.println(Arrays.toString(nums3));
    }
}