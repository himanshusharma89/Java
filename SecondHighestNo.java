import java.util.*;

class SecondHighestNo{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n,s=Integer.MIN_VALUE,b=Integer.MIN_VALUE;
        while((n=scan.nextInt())>0){
            if(b<n){
                s=b;
                b=n;
            }else if(s<n){
                s=n;
            }
        }
        System.out.println(s);
    }
}