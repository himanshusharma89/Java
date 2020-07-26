class PrimeAlgo{
    public static void main(String[] args) {
        int n=1001,cnt=0;
        int arr[]=new int[n];
        // for(int i=0;i<n;i++)
        //     arr[i]=-1;
        for(int i=2;i<n;i++){
            boolean prime=true;
            for(int j=0;j<cnt;j++){
                if(i%arr[j]==0){
                    prime=false;
                }
            }
            if(prime){
                System.out.println(i);
                arr[cnt++]=i;
            }
        }
    }
}