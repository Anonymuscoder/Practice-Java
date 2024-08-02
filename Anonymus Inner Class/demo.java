//code for demonstrating anonymus inner class
class A {

    public void show() {
        System.out.println("in show");
    }
}

class Demo {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() { // anonymus inner class
                System.out.println("in anonymus inner class");
            }
        };
        obj.show();
    }
}