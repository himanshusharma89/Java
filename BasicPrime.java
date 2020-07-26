class BasicPrime{
    public static void main(String[] args) {
        int n=1000;//f=0;
        for(int i=2;i<=n;i++){
            boolean f=true;
            for(int j=2;j<=Math.sqrt(i)&&f;j++){
                if(i%j==0)
                    f=false;
            }
            if(f){
                System.out.println(i);
            }
        }
    }
}