
//Program for learning logical operators in java

class logicaloperator {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 9;
        int d = 10;

        boolean res1 = a < b && b > a; //Two conditions are connected using 'AND' operator
        System.out.println(res1);

        System.out.println(!res1); //Negation value of 'res1'

        boolean res2 = a < b || b < a; //Two conditions are connected using 'OR' operator
        System.out.println(res2);

        boolean res3 = a > b && b < a && c < d; //Three conditions are connected using 'AND' operator
        System.out.println(res3);
    }
}