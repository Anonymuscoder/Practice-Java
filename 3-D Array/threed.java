
//code for implementing 3-D array in java

class threed {
    public static void main(String[] args) {

        int nums[][][] = new int[3][4][4];

        System.out.println("Array created!");
        System.out.println("Printing created array empty array...");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    System.out.print(nums[i][j][k] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //inserting values manually in 3-D array and printing them
        System.out.println("Manually entering values in array at different locations and printing them...");
        nums[0][0][0] = 1;
        nums[0][0][1] = 2;
        nums[1][0][1] = 2;
        nums[1][0][0] = 2;
        
        System.out.println("nums[0][0][0] = "+nums[0][0][0]);
        System.out.println("nums[0][0][1] = "+nums[0][0][1]);
        System.out.println("nums[1][0][1] = "+nums[1][0][1]);
        System.out.println("nums[1][0][0] = "+nums[1][0][0]);
        System.out.println();

        System.out.println("Printing whole array with the inserted values..");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    System.out.print(nums[i][j][k] + " ");
                }
            }
            System.out.println();
        }
    }
}