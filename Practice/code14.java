//Q.Check if Two Strings are Anagrams:

import java.util.Scanner;
import java.util.Arrays;

public class code14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two string to check if they are anagram or not");

        String str = sc.next(); //inputs
        String str1 = sc.next();

        int n = str.length();//creating a character array
        int n1 = str1.length();
        int length = 0;
        System.out.println(n);
        System.out.println(n1);

        //checking the lengths of the given two strings
        if (n == n1) {
            length = n;
            System.out.println("Processing...");
        } else {
            System.out.println("Given string is not an anagram");
        }

        char[] ch = new char[length];
        char[] ch1 = new char[length];

        boolean check = false;


        for (int i = 0; i < length; i++) { //converting first string into character array
            char in = str.charAt(i); //accessing characters of the string one by one
            ch[i] = in; //pushing it in the character array
        }
        for (int i = 0; i < length; i++) { //converting first string into character array
            char in = str1.charAt(i); //accessing characters of the string one by one
            ch1[i] = in; //pushing it in the character array
        }

        Arrays.sort(ch); //sorting array
        Arrays.sort(ch1);

        System.out.println(ch);
        System.out.println(ch1);

        for (int i = 0; i < length; i++) { //matching each character of the array
            if (ch[i] == ch1[i]) {
                check = true;
            } else {
                check = false;
            }
        }

        if (check) { //if true
            System.out.println(check + " Given String is Anagram");
        } else {
            System.out.println("Given String is not Anagram");
        }
    }
}
