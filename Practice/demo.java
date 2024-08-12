//code for implementing authentication 

import java.util.*;

interface Credentials {
    String name = "admin#12456";
    String password = "admin@7890";

    void auth(String name, String password);
}

class Authentication implements Credentials {

    public void auth(String n, String p) {

        if (Credentials.name.equals(n) && Credentials.password.equals(p)) {
            System.out.println("Login Success");
        } else {
            System.out.println("Wrong username or password");
        }
    }
}

class Demo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = null;
        String b = null;

        System.out.println("Enter username: ");
        a = sc.nextLine();

        System.out.println("Enter Password");
        b = sc.nextLine();

        Credentials c = new Authentication();
        c.auth(a, b);

        sc.close();
    }
}