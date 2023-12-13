public class MajorityElement {
    public static int countInRange(int[] nums,int num,int lo,int hi){
        int count = 0;
        for(int i=lo;i<=hi;i++){
            if(nums[i]==num){
                count++;
            }
        }
        return count;
    }
    public static int majElemRec(int[] nums,int lo,int hi){
        //base case
        if(lo==hi){
            return nums[lo];
        }
        //recurse on right and left part
        int mid = lo+(hi-lo)/2;
        int left = majElemRec(nums,lo,mid);
        int right = majElemRec(nums, mid+1, hi);
        // if left and right agrees
        if(left==right){
            return left;
        }
        //check whether right or left which is bigger
        int leftcount = countInRange(nums, left,lo, mid);
        int rightcount = countInRange(nums, right, mid+1, hi);
        return leftcount>rightcount ? left : right;
    }
    public static int majorityElement(int nums[]){
        return majElemRec(nums, 0, nums.length-1);
    }
    
    public static void main(String[] args) {
        int [] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }
}
