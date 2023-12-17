public class GridWaysOP {
    public static int permut(int n){
        if(n==0){
            return 1;
        }
        return n*permut(n-1);
    }
    public static int GridWays(int m,int n){
        int total = permut(m+n-2)/(permut(m-1)*permut(n-1));
        return total;
    }
    
    public static void main(String[] args) {
        System.out.println(GridWays(3, 3));
    }
}