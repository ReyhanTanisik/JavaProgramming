package day15_ForLoop;

public class ReplaceX {
    public static void main(String[] args) {
        String str="xcodeX";
        String result= str.replace("x","a").replace("X","a");// we can reuse it twice !! we can call it twice
        System.out.println(result);
    }
}
