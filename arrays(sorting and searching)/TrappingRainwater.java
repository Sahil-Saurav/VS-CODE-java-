public class TrappingRainwater {
    
    public static int max(int arr[],int start,int end){
        int max = Integer.MIN_VALUE;
        for(int i = start;i<end;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int index(int arr[],int n){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                return i;
            }
        }
        return -1;
    }
    
    public static void volume(int[] arr){
        int vol = 0;
        int max = max(arr,0,arr.length);
        int Rmax = max(arr,index(arr,max)+1,arr.length);
        int Lmax = max(arr,0,index(arr,max));
        for(int i=0;i<index(arr,max);i++){
            vol = vol+(Lmax - arr[i]);
        }
        for(int i=arr.length-1;i>index(arr,max);i--){
            vol = vol+(Rmax - arr[i]);
        }
        System.out.println("Max Volume of Rainwater Trapped is: "+vol);
    }
     
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        volume(arr);
        
    }
}