//code for demonstrating method overriding in java

class Calc{
    public int add(int n1, int n2){
        return n1+n2;
    }
}

class AdvCalc{
    public int add(int n1, int n2){         //this method will be called
        return n1+n2+1;                 
    }
}

class Demo{
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        int r = obj.add(5, 4);
        System.out.println(r);
    }
}