import java.util.Scanner;

class JaggedArray{

    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int arr[][]=new int[2][];
        arr[0]=new int[2];
        arr[1]=new int[3];
        for(int i=0;i<2;i++)
        {
            arr[0][i]=scan.nextInt();
        }
        for(int i=0;i<3;i++)
        {
            arr[1][i]=scan.nextInt();
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}