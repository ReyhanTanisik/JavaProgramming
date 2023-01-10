package day24_customMethods_return;

public class ReturnMethodPractice {
    public static void main(String[] args) {

      int max= max(100,200);
      int multiplication=max*2;
        System.out.println(multiplication);



    }
    public static int max ( int a , int b){
        int result=0;
        if(a>b){
            result=a;
        }else{
            result=b;
        }
        return result;
    }
}
