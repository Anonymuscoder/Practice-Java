
//Program for learning different arithmetic operators in java

public class arithmeticoperators {

    public static void main(String[] args) {
        int a =5;
        int b =5;

        int c = a+b; //use of addition operator
         System.out.println(c);

        int d = a % b; // use of modulo operator * provides remainder of the divisiom
         System.out.println(d); 

        int e = a - b; //use of subtraction operator
         System.out.println(e);
        
        int f = a / b; //use of division operator *provides quotient of the division
         System.out.println(f);

        int g = a++; //post-incrementing the value of 'a' *fetches the value then increment
         System.out.println(g);

        int h = ++a; //pre-incrementing the value of 'a' *increments value then fetch
         System.out.println(h); //output will be 7 as the value for 'a' is already post-incremented at line no.22
                
        int i = a--; // post- decrementing the value of 'a'
         System.out.println(i);

        a +=2; // adding 2 to the value of 'a'
        System.out.println(a);
            

    }
}
