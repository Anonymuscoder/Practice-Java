
//Program for implementing for-loop in java
//Its a program for a calendar of days and working hours 

public class forloop {

    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            System.out.println("Day " + i);
            for (int j = 1; j <= 9; j++) {
                System.out.println((j + 8) + "-" + (j + 9));
            }
        }
    }
}
