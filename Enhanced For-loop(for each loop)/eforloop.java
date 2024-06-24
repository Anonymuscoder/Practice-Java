
//code for implementing Enhanced for-loop (for-each loop) in java

class Student{
    String name;
    int rollno;
    int marks;

}


class eforloop{
    public static void main(String[] args) {
        
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        
        s1.name="Harish";
        s1.rollno=23;
        s1.marks=87;

        s2.name="Ravindra";
        s2.rollno=53;
        s2.marks=67;

        s3.name="Arjun";
        s3.rollno=13;
        s3.marks=65;

        Student students[] = new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        System.out.println("Name "+"Roll no. "+"Marks ");
        for(Student stud : students){
            System.out.println(stud.name+" "+stud.rollno+"     "+stud.marks);
        }

    }
}