//code for demonstrating abstract keyword in java

abstract class Car {

    public abstract void drive();

    public abstract void fly();

    public void playMusic() {
        System.out.println("playing music...");
    }
}

abstract class WagonR extends Car {

    public void drive() {
        System.out.println("driving...");
    }
}

class UpdatedWagonR extends WagonR {

    public void fly() {
        System.out.println("flying...");
    }
}

class Demo {

    public static void main(String[] args) {

        UpdatedWagonR obj = new UpdatedWagonR();
        obj.playMusic();
        obj.drive();
        obj.fly();

    }
}