//Q. Use a for loop to calculate the sum of the first 100 natural numbers.

class code8 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1; i<=100; i++){
            sum = sum + i;
        }
        System.out.println("Sum for the first 100 numbers is: "+ sum);
    }
}
