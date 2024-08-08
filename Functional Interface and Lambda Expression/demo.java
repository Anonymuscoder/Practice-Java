//code for demonstrating functional interface with inner class and lambda expression

@FunctionalInterface
interface A {
    void show();
}

class Demo {
    public static void main(String[] args) {
        A obj = () -> System.out.println("in show"); // used lambda expression to reduce lines of code
        obj.show();
    }
}