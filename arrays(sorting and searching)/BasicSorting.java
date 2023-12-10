public class BasicSorting {

    public static void countingSort(int[] arr){
        //finding the range of the array(to create counting array)
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int[] count = new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++; //it will increase the number from 0 to 1 at the index of count which is equal to the value of arr[i]
        }
        //sorting
        int j =0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            } 
        }
    }
    
    public static void insertionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int temp = arr[i+1];
            int prev;
            // finding correct position of element
            for(prev=i;prev>=0 && arr[prev]>temp;prev--){
                arr[prev+1] = arr[prev];
                
            }
            // Insertion of element
            arr[prev+1] = temp;
        }
    }

    public static void selectionSort(int[] arr){

        for(int i=0;i<arr.length-1;i++){
            int minPos = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]>arr[j]){
                    minPos = j;
                }   
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    
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
    
    public static void main(String[] args) {
        int[] arr = {1,4,3,6,4,8,3,4,};
        countingSort(arr);
        for(int e : arr){
            System.out.print(e+" ");
        }
    }
}
