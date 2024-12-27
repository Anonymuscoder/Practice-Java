//code for reversing a number

import java.util.Scanner;

public class code25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int result = reverse(n);
        System.out.println(result);
    }

    public static int reverse(int n){
        int number = n;
        int reverseNumber = 0;
        while(number!=0){
            int lastDigit = number%10;
            reverseNumber = reverseNumber*10+lastDigit;
            number = number/10;
        }
        return reverseNumber;
    }
}
