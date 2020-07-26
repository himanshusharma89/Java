import java.util.Scanner;

class SmallestNo{
    public static void main(String[] args) {
        int a,b,c;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        a=scan.nextInt();b=scan.nextInt();c=scan.nextInt();
        if(a<b && a<c)
            System.out.println(a+" is the smallest");
        else if(b<c)
            System.out.println(b+" is the smallest");
        else
            System.out.println(c+" is the smallest");
    }
}