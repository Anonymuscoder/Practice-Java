//Q.Write a program to check if an integer entered by the user is even or odd.

import java.util.*;

class code4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if its an even number or odd..");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
        sc.close();
    }
}
