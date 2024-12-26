//Write a Java program to print all the prime numbers between 1 and 100.

public class code24 {
    public static void main(String[] args) {
        int num = 100;
        for(int i=2; i<=num; i++){
            boolean isPrime = true;
            for(int j=2;j<=i/2;j++){ //if i/2 is true then enter this block
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i);
            }
        }
    }
}
