
//code for printing a table of number input by user

import java.util.*;

class exercise{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get its table:");
        int n = sc.nextInt();
        for(int i=1; i<=10; i++){
            
            System.out.println(n+"X"+i+"="+(n*i));
        }
        sc.close();
    }
}