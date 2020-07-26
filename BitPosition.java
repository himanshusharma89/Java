import java.util.*;

class BitPosition{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(Integer.toBinaryString(x));
        //int pos=sc.nextInt();
        // x=x>>4;
        // System.out.println(Integer.toBinaryString(x));
        int bit1=3&(x>>3);
        //int bit2=1&(x>>5);
        System.out.println(Integer.toBinaryString(bit1));
        //System.out.println(bit);
    }
}