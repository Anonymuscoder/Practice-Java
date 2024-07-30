//code for demonstrating Compile-Time polymorphism

class Calc {

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

}

class Demo {
    public static void main(String[] args) {
        Calc obj = new Calc();
        System.out.println(obj.add(1, 5, 16));
    }
}