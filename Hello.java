class Hello{
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("1\n2\n3\n");//Meaning of next character changes
        System.out.println("1\t2\t3\t");//escape sequences
        System.out.println("1\b2\b3\b");//net beans
        System.out.println("1\\2\\3\\");
        System.out.println("1\"2\"3\"");//string terminator
        byte b='\n';
        System.out.println(b);
        b='\t';
        System.out.println(b);
        b='\r';
        System.out.println(b);
        b='\b';
        System.out.println(b);
        System.out.println("\100");//////octal value
        b=0100;//in C and Java if you write a number starting with 0, the number is by default octal number
        System.out.println(b);
        b=0b1100100;//in java max 127
        System.out.println(b);
        b=0b1000000;
        System.out.println(b);
        //System.out.println(1+2+3+4+5);
        System.out.println("Hello \012 World");//octal form of '\n' or 10
        //2^16 total unicode characters
        System.out.println("\u0960");
        // Difference b/w 0:integer "0":String '0':character 0 (48 in C) '\0':octal zero,ascii(0),null
    }
}