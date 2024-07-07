//code for demonstrating this keyword in java

class Human
{
    private int age;
    private String name;

    public void setAge(int age) {
        this.age = age;  //this keyword used here
    }
    public void setName(String name) {
        this.name = name;
    }  
    public void show(){
        System.out.println("Name: "+name+"  Age: "+age);
    }
}
class Demo{
    public static void main(String[] args) {
        Human obj= new Human();
        obj.setAge(30);
        obj.setName("Ramesh");
        obj.show();
    }
}