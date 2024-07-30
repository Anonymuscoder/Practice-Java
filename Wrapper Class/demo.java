//code for demonstrating wrapper class in java 

class A {

    int num = 7;
    Integer num1 = num; // autoboxing

    // int num2 = num1.intValue(); ** manual unboxing
    int num2 = num1; // auto-unboxing

    String str = "17";
    int n3 = Integer.parseInt(str); // converts string objects into int

    public void display() {
        System.out.print(num1 + " " + num2 + " " + n3);
    }

}

class Demo {
    public static void main(String[] args) {

        A obj = new A();
        obj.display();
    }
}