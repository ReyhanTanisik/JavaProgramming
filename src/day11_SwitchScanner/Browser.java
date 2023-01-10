package day11_SwitchScanner;

public class Browser {
    public static void main(String[] args) {
        String browser="chrome";
        if (browser == "chrome"|| browser=="firefox"|| browser=="opera"|| browser=="safari"||browser=="edge"){
            System.out.println(browser + " browser is selected.");
        }else{
            System.out.println("Invalid Browser Name");
        }
    }
}
