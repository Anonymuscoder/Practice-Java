//program for practicing static block

class Laptop {
    String brand;
    int price;
    static String name;

    static{
        name="smartphone";
        System.out.println("in static block");
    }

    public static void show(Laptop obj){
        System.out.println("Brand: "+obj.brand+" Price: "+obj.price+" Name: "+name);

    }
}
class code23 {
    public static void main(String[] args) {
//        Laptop mb = new Laptop();//1st class get loaded into class loader and static block is called, 2nd objects are created

        //if we want to just load class without creating any instance or object of class we use Class.forName(<classname>)
        try {
            Class.forName("Laptop"); //loads class using system loader into class loader
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

