//code for demonstrating constructors in java

class Human{
    private int age;
    private String name;

    public Human(){
        age=30;
        name="Harry";
    }

    public void show(){
        System.out.println("Name: "+name+'\n'+"Age: "+age);
    }
}
class demo{
    public static void main(String[] args) {
        Human obj = new Human();
        obj.show();
    }
}