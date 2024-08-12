//code for demonstrating Exception Handling in java with throw keyword
class Demo {
    public static void main(String[] args) {
        int n = 18;
        int m = 0;
        int r = 0;
        try {
            if (m > n)
                throw new Exception();

            r = n / m;
        } catch (ArithmeticException e) {
            System.out.println("Variable M cannot be zero, please change the value for M !!!!");
        } catch (Exception e) {
            System.out.println("subtracting m cause its bigger than n");
            m = m - n;
            r = n / m;
            System.out.println(r);
        }
    }
}