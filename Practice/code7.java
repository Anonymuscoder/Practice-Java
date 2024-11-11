//Q. Print the multiplication table of 5 using a for loop.

import java.util.*;

class code7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get its multiplication table...");
        int a = sc.nextInt();
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            System.out.println(a * i);
        }
        sc.close();
    }
}
