package day42_ExceptionsContinue;

public class MorningWorkOut {

    public static void main(String[] args) {

        System.out.println("-----Push up started--------");

        for (int i = 1; i <= 30; i++) {
            System.out.println("Push up " + i);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
        System.out.println("-------Push up completed----------");


        System.out.println("-------Pull up started--------");

        for (int i = 0; i <= 30; i++) {
            System.out.println("\rPull up " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("\r-------Pull ups completed--------");

    }


    public static void sleep(double seconds) {

        try {
            Thread.sleep((long) (seconds * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
