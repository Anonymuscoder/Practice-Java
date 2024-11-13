//Q. Write a Java program to find the maximum element in an integer array.

public class code11 {
    public static void main(String[] args) {
        int greater = 0;
        int[] arr = {12,23,43,5,67,56};
        for(int num: arr){ //enhanced for-loop
            if(num>greater){
                greater = num;
            }
        }
        System.out.println(greater);
    }
}
