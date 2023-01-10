package day14_String;

public class StringMethods1 {
    public static void main(String[] args) {
        String str1 = "       batch 10    "; // white spaces are the spaces who don't separate two words.
        str1= str1.trim();
        System.out.println("str1 = " + str1);

        String str2="Cydeo School";
        int n1=str2.indexOf("h");
        System.out.println("n1 = " + n1);

        int n2=  str2.indexOf("o"); // will return the index number of the first o.
        System.out.println("n2 = " + n2);

        String str3="Java Programming language";
        int n3=str3.indexOf("a ");
        System.out.println("n3 = " + n3);

        int n4=str3.indexOf("amm");
        System.out.println("n4 = " + n4);

        int n5=str3.indexOf("g ");
        System.out.println("n5 = " + n5);

        int n6= str3.indexOf("gua");
        System.out.println("n6 = " + n6);

        int n7=str3.lastIndexOf("g"); // last character "g"  that occur in the string
        System.out.println("n7 = " + n7);

        String s ="Java Nova Cava Wawa orange";
        int firstA = s.indexOf("a");
        int lastA=s.lastIndexOf("a");
        int secondA=s.indexOf("a ");
        int thirdA=s.indexOf("a C");
        int fourthA=s.lastIndexOf("av");
        int sixthA=s.lastIndexOf("awa");
        int seventhA=s.lastIndexOf("a ");

        System.out.println("firstA = " + firstA);
        System.out.println("lastA = " + lastA);
        System.out.println("secondA = " + secondA);
        System.out.println("thirdA = " + thirdA);
        System.out.println("fourthA = " + fourthA);
        System.out.println("sixthA = " + sixthA);
        System.out.println("seventhA = " + seventhA);


    }
}
