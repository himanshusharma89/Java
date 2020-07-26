import java.util.*;

class Max3{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int x,y,z;
        x=scan.nextInt();y=scan.nextInt();z=scan.nextInt();
        System.out.println(Integer.max(x, Integer.max(y, z)));
    }
}