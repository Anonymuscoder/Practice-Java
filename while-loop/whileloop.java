
//Program for Implementing while-loop with nested while-loop

class whileloop {

    public static void main(String[] args) {

        int i = 1;
        while (i <= 4) {

            System.out.println("Hello " + i);
            int j = 1;
            while (j <= 3) {

                System.out.println("Brock " + j);
                j++;
            }

            i++;

        }
    }

}