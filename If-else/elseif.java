
//Program for finding greatest value among 3 values using if-else-if ladder statement

public class elseif {
    public static void main(String[] args) {
        int x =5;
        int y =10;
        int z= 8;

        if(x>y && x>z)
            System.out.println(x+" is greatest");
        else if(y>x && y>z)
            System.out.println(y+" is greatest");
        else 
            System.out.println(z+" is greatest");
    }
    
}
