
//Program for implementing classes and Objects in java
//Following program performs addition of two numbers

class Calculator {

    public int add(int n1, int n2) {
        int r = n1 + n2;
        return r;
    }
}

public class Demo {

    public static void main(String[] args) {
        int a = 4;
        int b = 5;

        Calculator calc = new Calculator();
        int result = calc.add(a, b);
        System.out.println(result);
    }

}
