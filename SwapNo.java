import java.util.Scanner;

class SwapNo{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int a,b;
        System.out.println("Enter numbers to swap");
        a=scan.nextInt();b=scan.nextInt();
        System.out.println(a+" "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Swapped Numbers");
        System.out.println(a+" "+b);
        scan.close();
    }
}