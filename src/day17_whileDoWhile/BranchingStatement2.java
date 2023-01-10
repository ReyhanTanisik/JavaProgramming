package day17_whileDoWhile;

public class BranchingStatement2 {
    public static void main(String[] args) {
        for (char i = 'A'; i <= 'E'; i++) {
            if (i=='C'){ // C is skipped
                continue;
            }
            System.out.println(i);

        }
    }
}
