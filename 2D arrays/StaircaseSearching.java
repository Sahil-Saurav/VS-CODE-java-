public class StaircaseSearching {
    public static boolean search(int arr[][],int key){
            int row = 0;
            int column = arr[0].length-1;

            while(row>0 || column>0){
                if(key==arr[row][column]){
                    return true;
                }
                else if(key<arr[row][column]){
                    column--;
                }
                else if(key>arr[row][column]){
                    row++;
                }
            }
            return false;
        }

    public static void main(String[] args) {
        int[][] arr = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        System.out.println(search(arr,00));
    }
}
