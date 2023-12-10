public class Rough2 {
    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void countingSort(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int[] tarr = new int[max+1];
        for(int i=0;i<arr.length;i++){
            tarr[arr[i]]++;
        }
        int j = 0;
        for(int i=0;i<tarr.length;i++){
            while(tarr[i]>0){
                arr[j] = i;
                j++;
                tarr[i]--;  
            }
        }
    }
    public static void insertionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int temp =arr[i+1];
            int prev;
            for(prev=i;prev>=0 && arr[prev]>temp;prev--){
                arr[prev+1] = arr[prev];
                arr[prev] = temp;
            }
        }
    }
    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int minpos = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos]>arr[j]){
                    minpos = j;
                }
            }
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void mergeSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid = si+(ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    }
    public static void merge(int[] arr,int si,int mid,int ei){
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;
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
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=ei){
            temp[k++] = arr[j++];
        }
        for(i = 0,j = si;i<temp.length;i++,j++){
            arr[j] = temp[i];
        }
    }
    public static int majElem(int arr[]){
        //find max value
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        //create countarray and count the number
        int[] count = new int[max+1];
        for(int i = 0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //traversing count to find maxnumber
        int MajNum = 0;
        for(int i = 1;i<count.length;i++){
            if(count[i]>MajNum){
                MajNum = count[i];
            }
        }
        for(int i = 0;i<count.length;i++){
            if(count[i]==MajNum){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {-1,1,1,1,2,1};
        /*mergeSort(arr,0,arr.length-1);
        for(int e : arr){
            System.out.print(e);
        }*/
        System.out.println(majElem(arr));
    }    
}
