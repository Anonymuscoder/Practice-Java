
//program for learning the type conversion and casting in java

public class typeconversion1 {
    public static void main(String[] args) {
        byte b =125;
        int a = b; //Implicit Conversion of type byte into integer//
        System.out.println(a);
        int c =12;
        byte k = (byte) c; //Explicit Conversion of type integer into byte!!//
        System.out.println(k);

        float f= 5.6f;
        int d = (int) f; //Explicit conversion of type float into int
        System.out.println(d);
        
        byte t=10;
        byte v=30;
        int result= t*v; // type promotion due exceeding of values for byte datatype
        System.out.println(result);

    }
}
