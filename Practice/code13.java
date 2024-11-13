//Q. Write a program to count the number of vowels in a given string (using array).

import java.util.*;

public class code13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] vowels = {'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U'};
        System.out.println("Enter a string to count the number of vowels present in the string");
        String str = sc.nextLine();
        int count = 0;
        for(int i=0; i<vowels.length; i++){
            for(int j=0; j<str.length();j++){
                char ch = str.charAt(j);
                if(ch==vowels[i]){
                    count++;
                }
            }
        }
        if(count==0){
            System.out.println("There are no vowels present in the string..");
        }
        else{
            System.out.println("Number of vowels present in string: "+count);
        }
    }
}
