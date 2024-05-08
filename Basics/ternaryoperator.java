
// program for checking if the number is odd or even using ternary operator

class ternaryoperator{

    public static void main(String[] args) {
        int a =5;
        int result = 0;

        result = a%2==0 ? 10 : 20; //checks if value for a is an odd number or even, if its odd the value for result will be 20 or else value for result will be 10
        System.out.println(result);
    }

}