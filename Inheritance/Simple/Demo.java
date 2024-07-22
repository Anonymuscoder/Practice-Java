//code for demonstrating Simple Inheritance in java

class Calc {

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int sub(int n1, int n2) {
        return n1 - n2;
    }

}

class AdvCalc extends Calc

{

    public int mult(int n1, int n2) {
        return n1 * n2;
    }

    public int div(int n1, int n2) {
        return n1 / n2;
    }

}

class Demo {
    public static void main(String[] args) {

        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(5, 10);
        int r2 = obj.sub(25, 10);
        int r3 = obj.mult(5, 10);
        int r4 = obj.div(10, 2);

        System.out.println("Addition of given numbers: " + r1);
        System.out.println("Subtraction of given numbers: " + r2);
        System.out.println("Multiplication of given numbers: " + r3);
        System.out.println("Division of given numbers: " + r4);

    }

}