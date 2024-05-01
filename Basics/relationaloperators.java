
//Program for learning different relational operators in java

public class relationaloperators {  
    public static void main(String[] args) {
        int a=7;
        int b=8;
        
        boolean result1 = a > b; //checks if 'a' is greater than 'b'
        System.out.println(result1);

        boolean result2 = a < b; //checks if 'a' is less than 'b'
        System.out.println(result2);

        boolean result3 = a >= b; //checks if 'a' is greater than or equals to 'b'
        System.out.println(result3);

        boolean result4 = a <= b; //checks if 'a' is less than or equals to 'b'
        System.out.println(result4);

        boolean result5 = a != b; //checks if 'a' is not equal to 'b'
        System.out.println(result5);

        boolean result6 = a == b; //checks if 'a' is equal to 'b'
        System.out.println(result6);

        boolean f = true;
        System.out.println(!f); //negation value of 'f'       

    }
}
