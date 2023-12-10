public class SpiralMatrix {
    
    public static void spiral(int[][] arr){
        int startcol = 0;
        int startrow = 0;
        int endrow = arr.length-1;
        int endcol = arr[0].length-1;
        
        while(startcol<=endcol && startrow<=endrow){
            //top
            for(int j=startcol;j<=endcol;j++){
                //to avoid repetetion of last digit in odd number matrix
                if(startrow==endrow){
                    break;
                }
                System.out.print(arr[startrow][j]+" ");
            }
            //right
            for(int i=startrow+1;i<=endrow;i++){
                //to avoid repetetion of last digit in odd number matrix
                if(startcol==endcol){
                    break;
                }
                System.out.print(arr[i][endcol]+" ");
            }
            //bottom
            for(int j=endcol-1;j>=startcol;j--){
                System.out.print(arr[endrow][j]+" ");
            }
            //left
            for(int i=endrow-1;i>startrow;i--){
                System.out.print(arr[i][startcol]+" ");
            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }
    }
    
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        spiral(arr);
    }
}
