package day24_customMethods_return;

public class warmUpTasks {
    public static void main(String[] args) {

        initials("reyhan", "tanişik");
        domainEmail("rcorek@gmail.com");
        nameOfMonth(12);
    }

    public static void initials(String name, String lastName) {
        String result = "";
        result += name.charAt(0) + "." + lastName.charAt(0);
        result = result.toUpperCase();
        System.out.println(result);


    }


    public static void domainEmail(String email) {
        String domain = email.substring(email.indexOf("@") + 1, email.indexOf("."));
        System.out.println(domain);
    }


    public static void nameOfMonth(int month) {
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }

    public static void numberOfDay(int year, int month) {
        if (month >= 1 && month <= 12) {
            switch (month) {
                case 2:
                    if (year % 4 == 0) {
                        System.out.println("29 Days");
                    } else {
                        System.out.println("28 Days");
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("30 Days");
                    break;
                default:
                    System.out.println(" 31 Days");
                    break;
            }
        }
    }
}




