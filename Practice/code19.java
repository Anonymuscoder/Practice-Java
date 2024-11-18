//program for demonstrating method overloading

class Calculator {
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public double add(double a, double b){
        return a+b;
    }
}
class code19{
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result1 = calc.add(2,2);
        int result2 = calc.add(2,2,2);
        double result3 = calc.add(4,4);

        System.out.println("output of first add function: "+result1);
        System.out.println("output of second add function: "+result2);
        System.out.println("output of third add function: "+result3);
    }
}
