class Basic{
    public static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f += f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        final int n = 3;
        int sum = 0;
        int fact=1;
        for (int i = 1; i <= n; i++) {// i+2
            //if (i % 2 != 0) {
                fact*=i;
                sum += fact;
                // c++;
                // if(c==m)
                //     break;
            //}
        }
        System.out.println(sum);
        fact=1;sum=0;
        for (int i = 1; i <= n; i++) {// i+2
            //if (i % 2 != 0) {
                fact*=i;
                sum += i/fact;
                // c++;
                // if(c==m)
                //     break;
            //}
        }
        System.out.println(sum);

        fact=1;sum=0;
        for (int i = 1; i <= n; i++) {// i+2
            fact*=i;
            if (i % 2 != 0) {
                sum += fact;
            }
        }
        System.out.println(sum);

        sum=0;
        int p=2,t=p;
        for (int i = 1; i <= n; i++) {// i+2
            
            //if (i % 2 != 0) {
                sum += t;
                t=t*p;
                //p++;
            //}
        }
        System.out.println(sum);
        sum=0;
        p=2;t=p;
        for (int i = 1; i <= 5; i++) {// i+2
            
            if (i % 2 == 0) {
                sum += t;
            }
            t=t*p;
        }
        System.out.println(sum);

        sum=0;
        p=2;t=p;fact=1;
        for (int i = 1; i <= 5; i++) {// i+2
            
            fact*=i;
            //if (i % 2 == 0) {
                sum += t/fact;
            //}
            t=t*p;
        }
        System.out.println(sum);

        sum=0;
        int sign=1;
        fact=1;
        for (int i = 1; i <= 5; i++) {
            fact*=i;
            sum += fact*sign;
            //t=t*p;
            sign=sign*(-1);
        }
        System.out.println(sum);

        sum=0;
        sign=1;
        p=2;t=p;
        for (int i = 1; i <= 5; i++) {
            //fact*=i;
            sum += t*sign;
            t=t*p;
            sign=sign*(-1);
        }
        System.out.println(sum);
    }
}