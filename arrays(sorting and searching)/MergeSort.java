public class MergeSort {
    public static void mergeSort(int[] arr,int si,int ei){
        //base case
        if(si>=ei){
            return;
        }
        //work
        int mid = si+(ei-si)/2;
        mergeSort(arr, si, mid);//left part
        mergeSort(arr, mid+1, ei);//right part
        merge(arr, si, mid, ei);
    }
    public static void merge(int[] arr,int si,int mid,int ei){
        int temp[] = new int[ei-si+1];
        int i = si;//iterator for left
        int j = mid+1;//iterator for right
        int k = 0;//iterator for temp array

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        //left part
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        //right part
        while(j<=ei){
            temp[k++] = arr[j++];
        }
        //copying temp array to original
        for(int a=0,b=si;a<temp.length;a++,b++){
            arr[b] = temp[a];
        }

    }
    public static void main(String[] args) {
        int arr[] = {1,5,4,2,6,8,7,3};
        mergeSort(arr, 0, arr.length-1); 
        for(int i : arr){
            System.out.println(i);
        }
    }
}
