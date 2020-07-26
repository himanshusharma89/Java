import java.util.*;

class MaxwithoutArray{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n,b=Integer.MIN_VALUE;
        while((n=scan.nextInt())>0){
            if(b<n)
                b=n;
        }
        System.out.println(b);
    }
}