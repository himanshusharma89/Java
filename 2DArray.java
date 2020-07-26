import java.util.Scanner;

class Array2d{
	public static void main( String[] args){
		int r,c;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter rows and columns:");
		r=scan.nextInt();
		c=scan.nextInt();
		int arr[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}