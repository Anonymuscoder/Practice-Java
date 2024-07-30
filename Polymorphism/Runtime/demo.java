//code for demonstrating Runtime Polymorphism

class A {

    public void calc(int n1, int n2) {
        System.out.println(n1 + n2);
    }

}

class B extends A {

    public void calc(int n1, int n2) {
        System.out.println(n1 - n2);
    }

}

class C extends A {

    public void calc(int n1, int n2) {
        System.out.println(n1 * n2);
    }

}

class Demo {
    public static void main(String[] args) {

        A obj = new A();
        obj.calc(10, 14);

        obj = new B();
        obj.calc(10, 14);

        obj = new C();
        obj.calc(10, 14);
    }
}