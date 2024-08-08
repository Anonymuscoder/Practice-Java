//demonstrating lambda expression with return

@FunctionalInterface
interface A {
    int add(int i, int j);
}

public class demo {
    public static void main(String[] args) {
        A obj = (i, j) -> i + j; // returning i+j using lambda expression
        int result = obj.add(5, 10);
        System.out.println(result);
    }

}