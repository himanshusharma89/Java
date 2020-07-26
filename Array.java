import java.util.Scanner;

class Array{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int size;
        System.out.println("Enter size:");
        size=scan.nextInt();
        int arr[]= new int[size];
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        int sum=0;
        System.out.println("Marks:");
        for(int j=0;j<size;j++){
            sum=sum+arr[j];
            System.out.print(arr[j]+" ");
        }
        System.out.println();
        System.out.println("Sum:");
        System.out.println(sum);
        System.out.println("Average:");
        System.out.println(sum/size+"%");
        scan.close();
    }
}