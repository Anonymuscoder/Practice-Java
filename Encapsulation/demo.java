//code for demonstrating Encapsulation with Getters and Setters in Java

class Human{
    private int age;
    private String name;

    public void setAge(int a){   //Setter for variable age
        age=a;
    }

    public int getAge(){    //Getter for variable age
        return age;
    }

    public void setName(String n){  //Setter for variable name
        name= n;
    }

    public String getName(){    //Getter for variable age
        return name;
    }
}

public class demo {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(20);
        obj.setName("Rahul");
        System.out.println("Name"+"  "+"Age");
        System.out.println(obj.getName()+" : "+obj.getAge());
    }
    
}