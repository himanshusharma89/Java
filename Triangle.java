import java.util.Scanner;

class Triangle{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i<=j){
                    System.out.print("* ");
                }
                if(j<=i){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}