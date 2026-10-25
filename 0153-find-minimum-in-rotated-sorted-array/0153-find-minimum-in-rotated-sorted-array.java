import java.util.*;
class Solution {
    public int findMin(int[] nums) {
        // my approach, but fail when min value is in place of n-1 
        // int res = Integer.MAX_VALUE;
        // for(int i=1; i<nums.length; i++){
        //     if(nums[i-1]<nums[i]){
        //         res = Math.min(res, nums[i-1]);
        //     }
        // }
        // return res;

        int low = 0;
        int high = nums.length-1; 
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int res = Integer.MAX_VALUE;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[low] <= nums[high]){
                res = Math.min(res, nums[low]);
                break; 
            }
            if(nums[low] <= nums[mid]){ // take out min value from first half 
                min1 = Math.min(min1, nums[low]);
                low = mid+1; // eliminate all element except 1st one which is min value 
            }else{ // take out min value from second half 
                min2 = Math.min(min2, nums[mid]);
                high = mid - 1; // eliminate all element except mid value which is min value in second half 
            }
            res = Math.min(res, Math.min(min1, min2));
        }
        return res;
    }
}