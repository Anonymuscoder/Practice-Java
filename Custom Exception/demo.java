//code for implementing custom Exception in java

import java.util.*;

class CannotBeZero extends Exception {  //custom Exception

    public CannotBeZero(String str) {
        super(str);
    }
}

class Calc {

    public void addNum(int a, int b) {
        try {
            if (a == 0 && b == 0) {
                throw new CannotBeZero("numbers cannot be zero");
            }
        } catch (CannotBeZero e) {
            System.out.println("re-enter the numbers "+ e);
        }
        System.out.println("Answer is: " + (a + b));
    }
}

class Demo {
    public static void main(String[] args) {
        Calc c = new Calc();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        c.addNum(n1, n2);
        sc.close();
    }
}