public class SearchInRotatedSortedArray {
    public static int search(int arr[],int tar,int si,int ei){
        if(si>ei){
            return -1;
        }
        int mid = (si+ei)/2;
        if(arr[mid] == tar){
            return mid;
        }
        // for line 1
        if(arr[mid]>=tar){
            //case a
            if(arr[si]<=tar && tar<=arr[mid]){
                return search(arr, tar, si, mid-1);
            }
            //case b
            else{
                return search(arr, tar, mid+1, ei);
            }
        }
        // for line 2
         else{
            //case c
            if(arr[mid]<=tar && tar<=arr[ei]){
                return search(arr, tar, mid+1, ei);
            }
            //case d
            else{
                return search(arr, tar, si, mid-1);
            }
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        System.out.println(search(arr, 0, 0,arr.length-1));
    }
}
