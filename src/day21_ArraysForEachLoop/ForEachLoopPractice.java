package day21_ArraysForEachLoop;

public class ForEachLoopPractice {
    public static void main(String[] args) {

        String[] words= {"Java Programming","Cydeo School","Wooden spoon","Early Birds","Angry Birds"};
      for( String each: words ){
          System.out.println(""+each.charAt(0)+each.charAt(each.length()-1));
      }

    }
}
