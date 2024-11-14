//Q. Cloning an Array

import java.util.*;

public class code15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array..");
        int n = sc.nextInt(); //inputting size of array
        int[] arr = new int[n];

        //taking elements and pushing them into the array
        for(int i=0; i<n; i++){
            System.out.println("Enter a number");
            int temp = sc.nextInt();
            arr[i]=temp;
        }

        //copying items into new array
        int[] arr1 = new int[n];
        for(int i=0; i<n; i++){
            arr1[i] = arr[i];
        }

        //printing arrays
        System.out.println("copied array!!");
        for(int i=0; i<n; i++){
            System.out.println(arr1[i]);
        }

        System.out.println("original array!!");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }

}
