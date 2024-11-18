//program for practicing classes objects and methods

import java.util.*;

class addition {
    public int add (int a, int b){
        return a+b;
    }
}
class code18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        addition add = new addition();
        System.out.println("Enter two numbers");
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        int sum = add.add(n, n1);
        System.out.println("sum is: "+sum);

        sc.close();
    }
}
