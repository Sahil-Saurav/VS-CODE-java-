public class ProductOfArrayExceptItself {
    public static int prod(int[] nums,int n){
        int prod = 1;
        for(int i=0;i<nums.length;i++){
            if(i!=n){
            prod *= nums[i];
            }
        }
        return prod;
    }

    public static int[] func(int[] nums){
        int[] arr = new  int[nums.length];
        for(int i=0;i<arr.length;i++){
            arr[i] = prod(nums,i);
        }
        return arr;
    }

    public static int Rprod(int[] nums,int i){
        if(i==nums.length-1){
            return 1;
        }
        else{
            return nums[i]*Rprod(nums,i+1);
        }
    }

    public static int Lprod(int[] nums,int i){
        if(i==0){
            return 1;
        }
        else{
            return nums[i]*Lprod(nums,i-1);
        }
    }

    public static void productExceptSelf(int[] nums){
        int Rprod = 1;
        int Lprod =1;
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            Rprod = Rprod(nums, i);
            Lprod = Lprod(nums, i);
            arr[i] = Lprod*Rprod;
        }
        for(int e :arr){
            System.out.print(e+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        productExceptSelf(arr);
    }
}
