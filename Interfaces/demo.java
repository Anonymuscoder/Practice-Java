//code for demonstrating interfaces in java
interface A {
    int age = 44;
    String str = "Rahul";

    void show();
}

class B implements A {
    public void show() {
        System.out.println("Name: " + str + ", " + "Age: " + age);
    }
}

class Demo {
    public static void main(String[] args) {
        A obj = new B();
        System.out.println("Name: " + A.str);
        obj.show();
    }
}