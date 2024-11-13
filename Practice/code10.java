//Q. Write a program that asks the user to enter a number repeatedly until they enter zero, then displays the sum of all entered numbers.

import java.util.*;

public class code10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int sum = 0;
        do{
            System.out.println("Enter a number!");
            num = sc.nextInt();
            sum = sum + num;
        } while(num != 0);
        System.out.println(sum);

        sc.close();
    }
}
