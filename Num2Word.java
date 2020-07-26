class Num2Word{
    public static void main(String[] args) {
        String[] u= new String[] {"Zero","One","Two"};
        String[] t= new String[] {"Twenty", "Thirty"};
        int n=22;
        if(n>19)
            System.out.println(t[n/10-2]+" "+u[n%10]);
        else
            System.out.println(u[n]);
    }
}