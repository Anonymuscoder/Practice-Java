// code for demonstrating packages in java
//folder tools consists of Classes and files

import tools.*;   // importing all the classes present in package tools

class Demo{
    public static void main(String[] args) {

        AdvCalc obj = new AdvCalc();
        int n1 = obj.add(5, 4);
        int n2 = obj.sub(10, 5);
        int n3 = obj.mult(5, 10);
        int n4 = obj.div(10, 2);
        System.out.println("Addition of 5+4: "+n1);
        System.out.println("Subtraction of 10-5: "+n2);
        System.out.println("Multiplication of 5*10: "+n3);
        System.out.println("Division of 10/2: "+n4);

    }
}