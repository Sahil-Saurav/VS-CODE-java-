public class SumOfDiagonal {
    public static void sumDiagonal(int[][] arr){
        int DiagonalSum = 0;
        for(int i=0;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                if(i==j){
                    DiagonalSum += arr[i][j];
                }
            }
        }
        
        for(int i=0;i<arr.length;i++){
            for(int j=arr[i].length-1;j>=0;j--){
                if(i+j == arr.length-1){
                    DiagonalSum += arr[i][j];
                }
            }
        }
        if(arr.length%2 != 0){
            int mid = (arr.length-1)/2;
            DiagonalSum = DiagonalSum -arr[mid][mid];
        }
        System.out.println("Sum of Diagonals is: "+DiagonalSum);
    }

public static void main(String[] args) {
    int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
    sumDiagonal(arr);
}
}
