//code for demonstrating inner class in java
class A {
    public void show() {
        System.out.println("in outer class");
    }

    class B { // inner class
        public void config() {
            System.out.println("in inner class");
        }
    }
}

class Demo {
    public static void main(String[] args) {

        A obj = new A();
        obj.show();
        A.B obj1 = obj.new B(); // creating of object of inner class using object of outer class
        obj1.config();
    }
}