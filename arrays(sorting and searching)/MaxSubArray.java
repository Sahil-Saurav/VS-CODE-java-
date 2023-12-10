public class MaxSubArray {

    public static void kadaneAlgo(int arr[]){
        int max_end = 0;
        int max_so_far = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max_end += arr[i];
            if(max_end>max_so_far){
                max_so_far = max_end;
            }
            if(max_end<0){
                max_end = 0;
            }
        }
        System.out.println("Max Sum of the array is: "+max_so_far);
    }
   
    public static void prefixArray(int[] arr){
        int Max = Integer.MIN_VALUE;
        int currsum = 0;
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for(int i = 1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++){// j=i,so that we can also execute single digits sub array
                int end = j;
                currsum = (start == 0)? prefix[end] : prefix[end] + prefix[start-1];

                if(currsum>Max){
                    Max = currsum;
                }
            }
        } 
        System.out.println("Max sum of sub array is: "+currsum);
    }
    
    public static void maxSubArray(int[] arr){
        int Max = Integer.MIN_VALUE;
        int Min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++){
                int end = j;
                int MAX_sum = 0;
                int MIN_sum = 0;
                for(int k=start;k<=end;k++){
                    MAX_sum += arr[k];
                    MIN_sum += arr[k];
                    }
                System.out.println(MAX_sum);
                if(MAX_sum>=Max){
                   Max = MAX_sum;
                 }
                 if(Min>=MIN_sum){
                    Min = MIN_sum;
                 }
            }
        }
        System.out.println("Max Sum of Sub-Array is: "+Max);
        System.out.println("Min Sum of Sub-Array is: "+Min);
    }
   
    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        kadaneAlgo(arr);
    }
}
