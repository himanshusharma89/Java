class BasicFactor{
    public static void main(String[] args) {
        int n=100;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
        System.out.println("///////////////");
        //Perfect Number
        int s=0;
        for(int i=1;i<=100;i++){
            s=0;
            for(int j=1;j<=i/2;j++){
                if(i%j==0){
                    s+=j;
                }
            }
            if(s==i)
                System.out.println(i);
        }
        System.out.println("///////////////");
        //Prime factor
        n=480;
        int l=2,f=2,tmp=0;
        while(n!=1){
            f=0;
            if(n%l==0){
                System.out.println(l);
                while(n%l==0){
                    n=n/l;
                }
                // f=1;
            }else{
                l++;
            }
            // if(f==1){
            //     if(l!=tmp){
            //         System.out.println(l);
            //         tmp=l;
            //     }
            // }
        }
        System.out.println("///////////////");
        //Armstrong Number
        int q;s=0;
        for(int i=100;i<1000;i++){
            tmp=i;s=0;
            while(tmp>0){
                q=tmp%10;
                s+=q*q*q;
                tmp/=10;
            }
            if(s==i)
                System.out.println(s);
        }
    }
}