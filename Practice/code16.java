//code for demonstrating Multi Dimensional Array
public class code16 {
    public static void main(String[] args) {
        int [][] arr = new int [3] [4];
        arr[0][0] = 1;
        arr[0][1] = 1;
        arr[0][2] = 1;
        arr[0][3] = 1;

        arr[1][0] = 1;
        arr[1][1] = 1;
        arr[1][2] = 1;
        arr[1][3] = 1;

        arr[2][0] = 1;
        arr[2][1] = 1;
        arr[2][2] = 1;
        arr[2][3] = 1;

        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
