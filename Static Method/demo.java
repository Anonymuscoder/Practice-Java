//code for demonstrating static method in java 

class Mobile{
    String brand;
    int price;
    static String name;

    public static void show(Mobile obj){  //object of class given as static method's parameters 
        System.out.println(obj.brand+" : "+obj.price+" "+name);
    }
}

public class demo {

    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand="Samsung";
        obj1.price=1700;
        Mobile.name="Smartphone";

        Mobile.show(obj1); //static method called using class name
    }
}