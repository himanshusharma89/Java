import java.util.Scanner;
// Other imports go here, Do NOT change the class name
class MatrixMultiplication
{
  public static void main(String[] args)
  {
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    for(int l=0;l<n;l++){
      //Array 1
      int r1,c1;
      r1=scan.nextInt();c1=scan.nextInt();
      int arr1[][]=new int[r1][c1];
      for(int i=0;i<r1;i++){
        for(int j=0;j<c1;j++)
          arr1[i][j]=scan.nextInt();
      }
      //Array 2
      int r2,c2;
      r2=scan.nextInt();c2=scan.nextInt();
      int arr2[][]=new int[r2][c2];
      for(int i=0;i<r2;i++){
        for(int j=0;j<c2;j++)
          arr2[i][j]=scan.nextInt();
      }
      //Multiplication
      int arr[][]=new int[r1][c2];
      for(int i=0;i<r1;i++){
        for(int j=0;j<c2;j++){
          for(int k=0;k<c1;k++){
            arr[i][j]+=arr1[i][k]*arr2[k][j];//////notice it
          }
        }
      }
      ////////////////
      for(int i=0;i<r1;i++){
        for(int j=0;j<c2;j++){
          System.out.print(arr[i][j]+" ");
        }
        System.out.println();
      }
    }
  }
}