
//Program for demonstrating method overloading in java

class Overload{
 
    public int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }

    public int add(int n1, int n2){
        return n1+n2;
    }

    public double add(double n1, int n2){
        return n1+n2;
    }
}

class methodoverloading{

    public static void main(String[] args) {
        
        Overload obj = new Overload();
        int r1 =obj.add(5, 4, 3);
        double r2 = obj.add(5432678, 100);
        int r3 = obj.add(2,2);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
}