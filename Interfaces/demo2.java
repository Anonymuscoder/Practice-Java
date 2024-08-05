//code for demonstrating interfaces in java and inheriting interface into another interface

interface A {

    void show();

    void display();
}

interface X {
    void config();
}

interface Y extends X // Y interfaces extending interface X
{

}

class B implements A, Y {
    public void show() {
        System.out.println("in show");
    }

    public void display() {
        System.out.println("in display");
    }

    public void config() {
        System.out.println("in run");
    }
}

public class demo2 {
    public static void main(String[] args) {
        A obj = new B();         
        obj.display();
        obj.show();
        X obj1 = new B();
        obj1.config();
    }
}
