//code to check if a number is an Armstrong Number or Not

import java.util.Scanner;

public class code27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if its Armstrong number or not ");
        int n = sc.nextInt();

        int num = n;
        int num2 = n;
        int count = 0;
        double result = 0;

        while(num!=0){ //count for the digits
//            int temp = num % 10; //this can be removed because n/10 also removes the last digit
            num = num/10;
            count++;
        }
        System.out.println("count of digit is: "+count);

        while(num2!=0){
            int temp = num2 % 10;
            result = result + Math.pow(temp, count);
            num2 = num2/10;
        }

        if(result == n){
            System.out.println("Number is Armstrong");
        }
        else{
            System.out.println("Number is not armstrong");
        }

    }
}
