class Pattern{
    public static void main(String[] args) {
         int r=5;
         int c=5;//constant
        // for(int i=1;i<=r;i++){
        //     for(int j=1;j<=c;j++)
        //         System.out.print("*");
        //     System.out.println();
        // }
        //int j=1; 
        // for(int i=1;i<=r*c;i++){
        //     if(i%r==0)
        //         System.out.println();
        //     else
        //         System.out.print(i/c+1);
        // }
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(i==1)
                    System.out.print("*");
                else if(j==1)
                    System.out.print("*");
                else if(i==r)
                    System.out.print("*");
                else if(j==c)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(i==1)
                    System.out.print("*");
                else if(i==j)
                    System.out.print("*");
                else if(i==r)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(i==1)
                    System.out.print("*");
                else if(i+j==r+1)
                    System.out.print("*");
                else if(i==r)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(i+j==r+1)
                    System.out.print("*");
                else if(i==j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(i+j==r+1)
                    System.out.print("*");
                else if(i==r)
                    System.out.print("*");
                else if(j==c)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("........................................");
        r=5;c=5;
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(i+j==r+1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
            for(int k=1;k<=c-1;k++){
                if(i+1==k)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}