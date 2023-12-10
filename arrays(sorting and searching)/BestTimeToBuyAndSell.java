public class BestTimeToBuyAndSell{
    
    public static int buyAndSell(int arr[]){
        int curprofit = 0;
        int maxprofit = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                curprofit = arr[j] - arr[i];
                if(curprofit>maxprofit){
                    maxprofit = curprofit;
                }
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int[] arr = {7,6,5,4,1,2};
        System.out.println(buyAndSell(arr));
    }
}