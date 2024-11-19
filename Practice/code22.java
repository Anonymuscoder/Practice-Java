//program for practicing static methods in java
//static method do not allow any non-static variable to be used directly but we can use them in directly
class Mobile {
    String brand;
    int price;
    static String name;

    public static void show(Mobile obj){
        System.out.println("Brand: "+obj.brand+" Price: "+obj.price+" Name: "+name);
    }
}

class code22{
    public static void main(String[] args) {
        Mobile mb = new Mobile();
        Mobile mb1 = new Mobile();
        Mobile mb2 = new Mobile();

        Mobile.name = "smartphone";

        mb.brand="samsung";
        mb.price=3440;

        mb1.brand="apple";
        mb1.price=2400;

        mb2.brand="xiaomi";
        mb2.price=1000;

        Mobile.show(mb);  //static methods are called using their class name
        Mobile.show(mb1);
        Mobile.show(mb2);
    }
}
