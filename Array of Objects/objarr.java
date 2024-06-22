
//code for implementing array of objects in java

class Student {

    String name;
    int rollno;
    int marks;
}

class objarr {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.name = "Harish";
        s1.rollno = 21;
        s1.marks = 80;

        s2.name = "Navin";
        s2.rollno = 42;
        s2.marks = 80;

        s3.name = "Arjit";
        s3.rollno = 03;
        s3.marks = 80;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        System.out.println("Name"+" "+" Roll no."+" "+"Marks");

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + "   " + students[i].rollno + "      " + students[i].marks);
        }

    }
}