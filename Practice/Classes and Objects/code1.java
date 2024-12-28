import java.util.Scanner;

class Car {
    String brand;
    String model;
    int year;

    public void displayInfo(Car obj){
        System.out.println("Brand Name is: "+obj.brand);
        System.out.println("Model: "+obj.model);
        System.out.println("Year is: "+obj.year);
    }
}
class code1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.nextLine();

        Car[] cars = new Car[n]; //creating array of type car of n length

        for (int i = 0; i < n; i++) {
            cars[i] = new Car(); // Initialize a new Car object for position 0

            System.out.println("Enter details for Car " + (i + 1) + ":");

            System.out.print("Brand: ");
            cars[i].brand = sc.nextLine();

            System.out.print("Model: ");
            cars[i].model = sc.nextLine();

            System.out.print("Year: ");
            cars[i].year = sc.nextInt();
            sc.nextLine(); // Consume newline
        }
        // Display information for each Car object
        System.out.println("\nDetails of Cars:");
        for (int i = 0; i < n; i++) {
            cars[i].displayInfo(cars[i]);
            System.out.println(); // Add a blank line for better readability
        }

        sc.close(); // Close the scanner
    }

    }
