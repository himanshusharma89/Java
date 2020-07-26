class BitWise{
    public static void main(String[] args) {
        // !:not ~compliment
        // int i=100;
        // System.out.println(Integer.toBinaryString(i));
        // int j=~i;
        // System.out.println(Integer.toBinaryString(j));

        //Code to print umber with preceeding zero
        // System.out.print("00000000000000000000000000000000".substring(0,Integer.SIZE-Integer.toBinaryString(i).length()));
        // System.out.println(Integer.toBinaryString(i));
        // int j=111;
        // System.out.print("00000000000000000000000000000000".substring(0,Integer.SIZE-Integer.toBinaryString(j).length()));
        // System.out.println(Integer.toBinaryString(j));
        // int k=i&j;
        // System.out.print("And\n"+"00000000000000000000000000000000".substring(0,Integer.SIZE-Integer.toBinaryString(k).length()));
        // System.out.println(Integer.toBinaryString(k));
        // k=i|j;
        // System.out.print("Or\n"+"00000000000000000000000000000000".substring(0,Integer.SIZE-Integer.toBinaryString(k).length()));
        // System.out.println(Integer.toBinaryString(k));
        // k=i^j;
        // System.out.print("XOr\n"+"00000000000000000000000000000000".substring(0,Integer.SIZE-Integer.toBinaryString(k).length()));
        // System.out.println(Integer.toBinaryString(k));

        //i=i^j; i=i^j; i will be original i;
        //for finding one unique element in array using xor
        int arr[]=new int[]{10,12,13,15,7,10,12,13,15};
        int sum=0;
        for(int i:arr)
            sum^=i;
        System.out.println(sum);
        int i=Integer.MIN_VALUE;
        System.out.println(Integer.toBinaryString(i));
        
        i=i>>1;
        System.out.println(Integer.toBinaryString(i));
    }
}