//code for demonstrating abstract keyword and anonymus inner class
abstract class A {
    public abstract void show();
}

class Demo {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("in show");
            }
        };
        obj.show();
    }
}