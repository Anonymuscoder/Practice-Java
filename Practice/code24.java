//Write a Java program to print all the prime numbers between 1 and 100.

public class code24 {
    public static void main(String[] args) {
        int num = 100;
        for(int i=2; i<=num; i++){
            boolean isPrime = true;
            for(int j=2;j<i;j++){ //loop from 2 to less than the number        (approach 2: if i/2 is true then enter this block)
                if(i%j==0){ //check if i is divible by number less than itself or not
                    isPrime = false; //if yes then its not an prime number
                    break;
                }
            }
            if(isPrime){
                System.out.println(i);
            }
        }
    }
}
