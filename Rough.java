public class Rough {
    
    public static int optimizedPowerOfNumber(int num,int pow){
        if(pow == 0){
            return 1;
        }
        else if(pow%2 == 0){
            return optimizedPowerOfNumber(num, pow/2)*optimizedPowerOfNumber(num, pow/2);
        }
        else{
            return num*optimizedPowerOfNumber(num, (pow-1)/2)*optimizedPowerOfNumber(num, (pow-1)/2);
        }
    }
    
    public static int powerOfNumber(int num,int pow){
        if(pow == 0 ){
            return 1;
        }
        else{
            return num*powerOfNumber(num, pow-1);
        }
    }

    public static void decreasingNumber(int n){
        if(n==0){
            System.out.println("0");
        }
        else{
            System.out.print(n+" ");
            decreasingNumber(n-1);
        }
    }

    public static StringBuilder stringCompression(String str){
        int count = 1;
        StringBuilder st = new StringBuilder("");
        st.append(str.charAt(0));
        for(int i=1;i<str.length();i++){
            if(str.charAt(i) == str.charAt(i-1)){
                count++;
                if(i == str.length()-1){
                    st.append(count);
                }
            }
            else if(str.charAt(i) != str.charAt(i-1)){
                if(count>1){
                    st.append(count);
                }
                count = 1;
                st.append(str.charAt(i));
            }
        }
        return st;
    }
    
    public static boolean checkPalinodromeString(String str){
        for(int i=0,j=str.length()-1;i<j;i++,j--){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
        }
        return true;
    }
    
    public static void transpose(int[][] arr){
        int [][] trans = new int[arr[0].length][arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                trans[j][i] = arr[i][j];
            }
        }
        for(int i=0;i<trans.length;i++){
            for(int j=0;j<trans[0].length;j++){
                System.out.print(trans[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static int count(int[][] arr,int n){
        int sum = 0;
        for(int i=0;i<arr[n-1].length;i++){
            sum += arr[n-1][i];
        }
        return sum;
    }
    
    public static void insertionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int temp = arr[i+1];
            int prev;
            for(prev=i;prev>=0 && arr[prev]>arr[prev+1];prev--){
                arr[prev+1] = arr[prev];
            }
            arr[prev+1] = temp;
        }
    }
    
    public static void countingSort(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int count[] = new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
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
    
    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
       int[] arr = {1,3,4,6,2,7,9,2};
       System.out.println(optimizedPowerOfNumber(2, 10));
    }
}