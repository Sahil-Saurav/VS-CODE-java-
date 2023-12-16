public class NQueensCount {
    static int count = 0;

    public static boolean isSafe(char box[][],int row,int col){
        // vertical up
        for(int i=row;i>=0;i--){
            if(box[i][col]=='Q'){
                return false;
            }
        }
        // left up
        for(int i=row,j=col;i>=0 && j>=0;i--,j--){
            if(box[i][j]=='Q'){
                return false;
            }
        }
        // right up
        for(int i=row,j=col;i>=0 && j<box.length;i--,j++){
            if(box[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void nQueens(char box[][],int row){
        if(box.length == row){
            count++;
            return;
        }
        // for rows(queens possible at row)
        for(int j=0;j<box.length;j++){
            if(isSafe(box, row, j)){
            box[row][j]='Q';
            nQueens(box, row+1);  //recursion
            box[row][j]='x';  //backtracking
            }
        }
    }
    public static void main(String[] args) {
        int n=5;
        char[][] box = new char[n][n];

        //initialization
        for(int i=0;i<box.length;i++){
            for(int j=0;j<box.length;j++){
                box[i][j]='x';
            }
        }
        nQueens(box, 0);
        System.out.println("Total Ways of solving this problem is: "+count);
    }
}
