import java.util.*;
class Solution {
    public boolean search(int[] nums, int target) {
        // linear search 
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i] == target){
        //         return true;
        //     }
        // }
        // return false;
        //binary search 
        Arrays.sort(nums);
        int low = 0; 
        int high = nums.length-1; 
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                return true;
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return false;
    }
}