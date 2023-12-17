public class GridWays {
    public static int countGridWays(int i,int j,int m,int n){
        //base case
        if(i==m-1 && j==n-1){
            return 1;
        }
        else if(i==m || j==n){
            return 0;
        }
        // recursion
        
        return countGridWays(i+1, j, m, n) + countGridWays(i, j+1, m, n); //down and right respectively.
        
    }
    
    public static void main(String[] args) {
        int n=3,m=3;
        System.out.println(countGridWays(0, 0, m, n));
    }
}
