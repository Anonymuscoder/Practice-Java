//code for demonstrating constructor overloading in java

class Human{
    private int age;
    private String name;

    public Human(){    //default constructor
        age = 18;
        name = "Harsh";
    }
    public Human(int age, String name){     //parameterize constructor
        this.age=age;
        this.name=name;
    }

    public void show(){
        System.out.println("Name: "+name+'\n'+" Age: "+age);
    }
}

public class demo {
    public static void main(String[] args) {
        Human obj = new Human();
        Human obj1 = new Human(20,"Rakesh");
        obj.show();
        obj1.show();
    }
     
}