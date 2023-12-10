
public class BinarySearch {

public static int binarySearch(int[] arr,int n){
    int low = 0;
    int high = arr.length-1;
    int mid;
    while(low<=high){
        mid = (low+high)/2;
        if(arr[mid] == n){
            return mid;
        }
        else if(arr[mid]>n){
            high = mid-1;
        }
        else{
            low = mid+1;
        }
    }
    return -1;
}
    public static void main(String[] args) {
        int arr[] = {1,3,4,6,8,10,12};
        System.out.println(binarySearch(arr,8));
    }
}
