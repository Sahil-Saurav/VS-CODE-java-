public class SearchingRotatingArray {
    
    public static int search(int arr[],int n){
        int num = arr.length-1;
        int pivot = num;
        for(int i=0;i<num;i++){
            if(arr[i]>arr[i+1]){
                pivot = i;
                break;
            }
        }
        int start = 0;
        int end = num;
        if(n>=arr[0]){
            end = pivot;
        }
        else{
            start = pivot+1;
        }
        while(start<=end){
            int mid = (start+end)/2;
            int midvalue = arr[mid];
            if(midvalue==n){
                return mid;
            }
            else if(arr[mid]>n){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
            
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] arr = {4,-1,3};
        System.out.println(search(arr,4));
    }
}
