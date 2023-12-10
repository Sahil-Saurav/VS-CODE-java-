public class MaxSubArrayProduct {
    
    public static int maxProductSubarray(int[] nums){
        int Lmax_so_far = Integer.MIN_VALUE;
        int Rmax_so_far = Integer.MIN_VALUE;
        int Lmax_end = 1;
        int Rmax_end = 1;
        for(int i=0;i<nums.length;i++){
            Lmax_end *= nums[i];
            if(Lmax_end>Lmax_so_far){ 
                Lmax_so_far = Lmax_end;
            }
            if(Lmax_end==0){
                Lmax_end = 1;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            Rmax_end *= nums[i];
            if(Rmax_end>Rmax_so_far){
                Rmax_so_far = Rmax_end;
            }
            if(Rmax_end==0){
                Rmax_end = 1;
            }
        }
        return Math.max(Lmax_so_far, Rmax_so_far);
    }

    public static void main(String[] args) {
        int[] arr = {2,-5,-2,-4,3};
        System.out.println(maxProductSubarray(arr));
    }
}