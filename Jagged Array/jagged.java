
//code for demonstrating jagged array in java

class jagged{
    public static void main(String[] args) {
        
        int nums [] [] = new int [3] [];
        nums[0] = new int [3];
        nums[1] = new int [4];
        nums[2] = new int [2];
        
        System.out.println("Array Created!");
        System.out.println("Printing the created array");

        for(int i=0; i< nums.length; i++){
            for(int j=0; j<nums[i].length; j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Inserting values in created array using Math.random() using type casting...");

        for(int i=0; i< nums.length; i++){
            for(int j=0; j< nums[i].length; j++){
                nums [i][j]=(int)(Math.random()*10);
            }
        }

        System.out.println("Printing Array with the inserted values..");

        for(int i=0; i< nums.length; i++){
            for(int j=0; j<nums[i].length; j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }

    }
}