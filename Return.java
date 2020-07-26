import java.util.Scanner;

class Return{
    public static void main(String[] args) {
        Return obj=new Return();
        int a=obj.Multiple(10);
        System.out.print(a);
    }
    public int Multiple(int n)
    {
        int y=n*n;
        return y;
    }
}