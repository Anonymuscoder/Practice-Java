//Q. Write a program to find the factorial of a given number using a while loop.

import java.util.*;

public class code9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number get its factorial");
        int n = sc.nextInt();
        int num = 1;
        int fact = 1;
        while(num<=n){
            fact = fact * num;
            num++;
        }
        System.out.println(fact);
        sc.close();
    }
}
