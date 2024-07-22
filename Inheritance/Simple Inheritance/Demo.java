//code for demonstrating simple inheritance in java

class Properties {
    double price;
    String color;
    String type;
    String model;

    public void getInfo(double price, String color, String type, String model) {
        this.price = price;
        this.color = color;
        this.type = type;
        this.model = model;
    }
}

class Car extends Properties {

    public void showCar() {
        System.out.println("Price: " + price + " INR");
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
        System.out.println("Model: " + model);
    }
}

class Demo {
    public static void main(String[] args) {

        Car obj = new Car();
        obj.getInfo(140000, "Blue", "Petrol", "Top");
        obj.showCar();
    }
}