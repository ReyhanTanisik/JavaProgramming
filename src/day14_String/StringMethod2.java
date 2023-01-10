package day14_String;

public class StringMethod2 {
    public static void main(String[] args) {
        String str="Java is fun, I love learning Java";
        String str2=str.replace("Java","Python");
        System.out.println(str);
        System.out.println(str2);

        String str3= "JohnSmith@yahoo.com";
        String str4=str3.replace("yahoo","gmail");
        System.out.println(str4);

        String s="dog dog dog dog dog";
        s=s.replace("dog","cat");
        System.out.println("s = " + s);

        String s2="C# is fun, C# is cool.";
        s2=s2.replace(" C#"," Java");
        System.out.println(s2);

        String result="Java Java Java";
        result=result.replaceFirst("Java","Python");
        System.out.println(result);

    }
}
