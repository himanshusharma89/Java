import java.util.Scanner;

class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter numbers");
        a=sc.nextInt(); b=sc.nextInt();
        System.out.println("Addition: "+ (a+b));
        System.out.println("Subtraction: "+ (a-b));
        System.out.println("Division: "+ (a/b));
        System.out.println("Multiplication: "+ (a*b));
        
    }
}