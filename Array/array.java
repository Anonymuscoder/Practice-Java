
//Code for demonstrating array in java, different operations on it 


class array{
    public static void main(String[] args) {

        int nums[] = {4,8,9,3,1,5};
        System.out.println("Element of nums[] at index 1 & 4");
        System.out.println(nums[1]);
        System.out.println(nums[4]);


        int nums2[] = new int [5];
        nums2[0]= 9;
        nums2[1]= 5;
        nums2[2]= 7;
        nums2[3]= 6;
        nums2[4]= 2;
        System.out.println("Elements in nums2[]...");

        for(int i=0; i<=4; i++){
            System.out.println(nums2[i]); 
        } 

        System.out.println("Updating nums2[]....");
        nums2[0] = 0;
        System.out.println("Elements in nums2[] after updating....");

        for(int i=0; i<=4; i++){
            System.out.println(nums2[i]); 
        } 

    }
}