import java.util.*;

class MergeArray{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
		
        int n=scan.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=scan.nextInt();
        
        int m=scan.nextInt();    
        int b[]=new int[m];
        for(int i=0;i<m;i++)
            b[i]=scan.nextInt();
            
        int arr[]=new int[n+m];
        for(int i=0;i<n;i++)
            arr[i]=a[i];
        for(int i=0;i<m;i++)
            arr[n+i]=b[i];
        
        Arrays.sort(arr);
        for(int i=0;i<n+m;i++)
            System.out.print(arr[i]+" ");
    }
}