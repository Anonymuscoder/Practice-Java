//Q.Create a program that takes two integers as input and demonstrates addition, subtraction, multiplication, 
//division, and modulus operations.

import java.util.*;

class code3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to apply arithmetic operations on them");
        int a = sc.nextInt();
        int b = sc. nextInt();

        //addition
        int sum = a + b;
        //subtraction
        int sub = a - b;
        //multiplication
        int mult = a * b;
        //division
        int div = a/b;
        //modulo
        int mod = a%b;

        //outputs
        System.out.println("Results...");
        System.out.println("Addition "+sum);
        System.out.println("Subtraction "+sub);
        System.out.println("Multiplication "+mult);
        System.out.println("Division "+div);
        System.out.println("Modulo "+mod);

        sc.close();
    }
}
