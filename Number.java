import java.util.Scanner;

class Number{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter numbers");
        int a,b;
        a=scan.nextInt();b=scan.nextInt();
        if(a<0)
            System.out.println(a+" is -ve number");
        else if(b<0)
            System.out.println(b+" is -ve number");
    }
}