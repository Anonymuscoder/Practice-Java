// Write a program to count the number of vowels in a given string (without using array).

import java.util.*;

public class code12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to count number of vowels present in the string..");
        String str = sc.nextLine();
        int count = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='O' || ch=='o' || ch=='U' || ch=='u') {
               count++;
            }
        }
        System.out.println("Number of vowels present in the string: "+count);
    }
}
