//code for demonstrating buffered reader class

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Demo {
    public static void main(String[] args) {

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        String str = null;
        System.out.println("Enter a String");
        try {
            str = bf.readLine();
        } catch (IOException e) {
            System.out.println("Error Occured");
        }
        System.out.println(str);
    }
}