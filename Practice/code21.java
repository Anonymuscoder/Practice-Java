//program for practicing static block in java
//value for the static variables remains the same for all the class instances
 class Person {
     static int number;
     static String name;
     String nickname;
     String friend;
}

class code21{
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();

        Person.number=23; //static variable can be called by using class name
        Person.name="Jade";
        p1.nickname="jadu"; // non-static variables are called by using reference variable name
        p1.friend="Tommy";

        p2.nickname="jay";
        p2.friend="Cade";

        p3.nickname="J";
        p3.friend="harry";

        Person persons[] = new Person[3]; //array of objects
        persons[0]=p1;
        persons[1]=p2;
        persons[2]=p3;

        for(int i=0; i< persons.length; i++){
            System.out.println("interation: "+i);
            System.out.println("Name: "+persons[i].name+" Number: "+persons[i].number+" Nickname: "+persons[i].nickname+" Friend: "+persons[i].friend);
        }


    }
}