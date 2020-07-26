import java.util.*;
public class Frequency
{
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    int n=scan.nextInt();
	    int arr[]=new int[n];
	    int f[]=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=scan.nextInt();
	        f[i]=-1;
	    }
	    int c;
	    for(int i=0;i<n;i++){
	        c=1;
	        for(int j=i+1;j<n;j++){
	            if(arr[i]==arr[j]){
	                c++;
	                arr[j]=0;
	            }
	        }
	        if(c>f[i]){
	            f[i]=c;
	        }
	    }
	    for(int i=0;i<n;i++){
	        if(arr[i]!=0)
	            System.out.println(arr[i]+" occurs "+f[i]+" times.");
	    }
	}
}
