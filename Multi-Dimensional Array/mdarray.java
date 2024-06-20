
//Code for implementing Multi-Dimensional Array in java and performing different operations on it

class mdarray{
    public static void main(String[] args) {
        
        int nums [] [] = new int [3] [4];

        System.out.println("Printing created empty array...");
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                System.out.print(nums[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
         
        System.out.println("fetching values using Math.random() by performing type casting....");
        for(int i=0; i<3; i++){ //fetching elements using Math library in java
            for(int j=0; j<4; j++){
                nums [i] [j]=(int)(Math.random() * 10);// type casting of double into integer
            }
        }
        System.out.println();

        System.out.println("Printing array with the values");
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                System.out.print(nums[i][j]+ " ");
            }
            System.out.println();
        }


    }
}
