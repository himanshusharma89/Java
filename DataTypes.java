//String is not a primitive data types
class DataTypes{
    public static void main(String[] args) {
        int x=100;//primitive
        // Integer y =new Integer(200);//warapper class
        // System.out.println(x);
        // System.out.println(y);
        // //
        // System.out.println(Integer.BYTES);
        // System.out.println(Integer.MAX_VALUE);
        // System.out.println(Integer.MIN_VALUE);
        // System.out.println(Integer.TYPE);
        // //
        // System.out.println(Float.BYTES);
        // System.out.println(Float.MAX_VALUE);
        // System.out.println(Float.MIN_VALUE);
        // System.out.println(Float.TYPE);
        // //
        // System.out.println(Long.BYTES);
        // System.out.println(Long.MAX_VALUE);
        // System.out.println(Long.MIN_VALUE);
        // System.out.println(Long.TYPE);
        // //
        // System.out.println(Double.BYTES);
        // System.out.println(Double.MAX_VALUE);
        // System.out.println(Double.MIN_VALUE);
        // System.out.println(Double.TYPE);
        // //
        // System.out.println(Short.BYTES);
        // System.out.println(Short.MAX_VALUE);
        // System.out.println(Short.MIN_VALUE);
        // System.out.println(Short.TYPE);
        // //
        // System.out.println(Character.BYTES);
        // System.out.println(Character.TYPE);
        // //
        // System.out.println(Boolean.TRUE);
        // System.out.println(Boolean.FALSE);
        // System.out.println(Boolean.TYPE);
        //
        //SignBit, Type Conversion
        System.out.println(Integer.toBinaryString(254));
        System.out.println(Integer.toHexString(254));
        System.out.println(Integer.toOctalString(236));
        
        Integer z= new Integer("236");//string to number
        System.out.println(z);

        x=Integer.parseInt("364");
        x++;
        System.out.println(x);
        x=Integer.parseInt("1100",2);
        System.out.println(x);
        System.out.println("\u0960".length());
        System.out.println(Integer.max(99,105));

        byte b=(byte) Integer.parseInt("11001000",2);
        System.out.println(b);
    }
}