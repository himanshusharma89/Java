import java.util.*;

public class MinDifference
{
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
        int num=scan.nextInt();
        while(num>0){
            int n=scan.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=scan.nextInt();
            Arrays.sort(arr);
            int d=arr[1]-arr[0];
            for(int i=0;i<n-1;i++){
                if(d>(arr[i+1] - arr[i]))
                    d=arr[i+1] - arr[i];
            }
            System.out.println(d);
            num--;
        }
	}
}
