package day11_SwitchScanner;

public class Grade {
    public static void main(String[] args) {
        char ch= 'B';
        switch (ch){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Great job");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Passed");
                break;
            case 'E':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invalid");
                break;

        }
    }
}
