public class NQueensPrintOnlyOne {
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
    public static boolean nQueens(char box[][],int row){
        if(box.length == row){
            return true;
        }
        // for rows(queens possible at row)
        for(int j=0;j<box.length;j++){
            if(isSafe(box, row, j)){
            box[row][j]='Q';
            if(nQueens(box, row+1)){
                return true;
            }
            box[row][j]='x';  //backtracking
            }
        }
        return false;
    }
    public static void printBox(char box[][]){
        System.out.println("--------Box--------");
        for(int i=0;i<box.length;i++){
            for(int j=0;j<box[i].length;j++){
                System.out.print(box[i][j]+ " ");
            }
            System.out.println();
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
        if(nQueens(box, 0)){
            System.out.println("Solutions Exist");
            printBox(box);
        }
        else{
            System.out.println("Solutions Doesn't exist");
        }
    }
}
