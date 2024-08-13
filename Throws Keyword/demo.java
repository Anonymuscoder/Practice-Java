//code for demonstrating throws keyword in java

import java.util.*;

class CannotBeZero extends Exception {

    public CannotBeZero(String str) {
        super(str);
    }
}

class Calc {
    public void addNum(int a, int b) throws CannotBeZero {      //throws keyword used
        if (a == 0 && b == 0) {
            throw new CannotBeZero("Numbers Cannot be zero");
        } else {
            System.out.println("Answer is: " + (a + b));
        }
    }
}

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calc c = new Calc();

        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            c.addNum(a, b);
        } catch (CannotBeZero e) {
            System.out.println(a + b + "Please Re-enter the numbers  " + e);
        }

        sc.close();
    }
}