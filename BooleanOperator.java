import java.util.Scanner;

class BooleanOperator{
    public static void main(String[] args) {
        boolean a,b;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter value");
        a=scan.nextBoolean();b=scan.nextBoolean();
        System.out.println(a&b);
        System.out.println(a|b);
        scan.close();
    }
}