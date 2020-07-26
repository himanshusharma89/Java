class Sieve{
    public static void main(String[] args) {
        int n=1001;
        boolean arr[]=new boolean[n];
        for(int i=0;i<n;i++){
            arr[i]=true;
        }
        for(int i=2;i<n;i++){
            if(i!=0){
                for(int j=i+1;j<n;j++){
                    if(j%i==0){
                        arr[j]=false;
                    }
                }
            }
        }
        for(int i=2;i<n;i++){
            if(arr[i]==true)
                System.out.println(i);
        }
    }
}