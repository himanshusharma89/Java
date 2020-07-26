import java.util.Scanner;

class Switch{
    public static void main(String[] args) {
        String str;
        System.out.println("Enter weekday code");
        Scanner scan= new Scanner(System.in);
        str=scan.nextLine();
        switch(str)
        {
            case "Mon": System.out.println("Monday");break;
            case "Tue": System.out.println("Tuesday");break;
            case "Wed": System.out.println("Wednesday");break;
            case "Thu": System.out.println("Thursday");break;
            case "Fri": System.out.println("Friday");break;
            case "Sat": System.out.println("Saturday");break;
            case "Sun": System.out.println("Sunday");break;
            default:  System.out.println("Invalid");break;
        }
    }
}