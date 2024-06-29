//code for demonstrating static block in java


class Mobile{
    String brand;
    int price; 
    static String name;

    static{
        name="Smartphone";
        System.out.println("in the static block");  //static block called at the time, when class gets load in class loader
    }

    public static void show(Mobile obj){
        System.out.println(obj.brand+" : "+obj.price+" "+name);
    }
}

public class demo{
    public static void main(String[] args) {
        Mobile obj = new Mobile();
        obj.brand="Samsung";
        obj.price=1700;
        Mobile.show(obj);
    }
}

