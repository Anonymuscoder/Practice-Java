//code for demonstrating static keyword in java

class Mobile{
    String brand;
    int price;
    static String name;

    public void display(){
        System.out.println(brand+" : "+price+" "+name);
    }
}

public class demo {

    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        Mobile obj2= new Mobile();

        obj1.brand="Samsung";
        obj1.price=1700;
        Mobile.name="Smartphone"; //static variable called using class name

        obj2.brand="Apple";
        obj2.price=2500;
        Mobile.name="Smartphone";

        obj1.display();
        obj2.display();
    }
}