//Q. Create a program that accepts three numbers and prints which one is the largest.

import java.util.*;

class code5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers to check which one is greatest among three..");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b && b == c && c == a) {
            System.out.println("All are Equal");
        } else {
            if (a > b && a > c) {
                System.out.println(a + " is greater");
            } else if (b > a && b > c) {
                System.out.println(b + " is greater");
            } else {
                System.out.println(c + " is greater");
            }
        }
        sc.close();
    }
}
