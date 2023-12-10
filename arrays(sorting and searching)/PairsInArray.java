public class PairsInArray {
    
    public static void arrayPairs(int arr[]){
        int i = 0;
        while(i<arr.length){
            int j = i+1; // j=i+1,because we need to make pairs,if we assign j = i,it will also print single value array
            while(j<arr.length){
                System.out.print("("+arr[i]+","+arr[j]+")");
                j++;
            }
            i++;
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        arrayPairs(arr);
    }
}
