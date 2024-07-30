//code for demonstrating upCasting and DownCasting in java

class A {

    public void show1() {
        System.out.println(" in A show ");
    }
}

class B extends A {

    public void show2() {
        System.out.println(" in B show ");
    }

}

class Demo {

    public static void main(String[] args) {

        A obj = new B(); // upcasting implicitly
        obj.show1();
        // obj.show2(); will show error
        B obj1 = (B) obj; // downcasting explicitly
        obj1.show2();
    }
}