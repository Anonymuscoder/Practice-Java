//program for practicing stringbuffer class and its methods

import java.util.Scanner;

public class code20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer("Rajat");
//        System.out.println("Enter a string to send it to StringBuffer class and perform operations using stringbuffer class methods");
//        String str = sc.next();
//        sb.append(str);
//        System.out.println("Content in StringBuffer is: "+str);
        System.out.println("length of string is: "+sb.length());
        System.out.println("StringBuffer capacity is: "+sb.capacity());
        System.out.println("String after appending a string is: "+sb.append(" Hello"));
        System.out.println("String after inserting a string at specific index is: "+sb.insert(5,"+"));

    }
}
