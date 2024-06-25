
//code for finding a rent of a car using java

class Car{
    int carid;
    String cartype;
    float rent;

    public float getrent(String cartype){
        if(cartype.equals("Small"))
            rent = 1000;
        
        else if(cartype.equals("Van"))
            rent = 4500;
        
        else
            rent = 7500;
        
        return rent;
    }

    public void showDetails(int carid, String cartype){
        System.out.println("Car id :"+carid);
        System.out.println("Car Type :"+cartype);
        System.out.println("Rent :"+rent);
    }

}

class carrent{
    public static void main(String[] args) {
        
        Car obj = new Car();
        obj.getrent("SUV");
        obj.showDetails(101, "SUV");
    }
}