//code for demonstrating enum class and giving value to the objects using parametrize constructor and default constructor and printing the objects of enum class with their values

enum Laptop {
    Macbook(2000), XPS(2200), Surface, Thinkpad(1200);

    private int price;

    private Laptop() { // default constructor
        price = 500;
    }

    private Laptop(int price) { // parametrize constructor
        this.price = price;
    }

    public int getPrice() { // getter
        return price;
    }

    public void setPrice(int price) { // setter
        this.price = price;
    }

}

class Demo {
    public static void main(String[] args) {
        for (Laptop lap : Laptop.values()) {
            System.out.println(lap + " : " + lap.getPrice());
        }
    }
}