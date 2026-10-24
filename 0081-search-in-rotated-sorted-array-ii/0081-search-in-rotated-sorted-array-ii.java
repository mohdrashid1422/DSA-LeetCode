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


        //binary search (but TC = O(log n) and SC = O(n)
        // Arrays.sort(nums);
        // int low = 0; 
        // int high = nums.length-1; 
        // while(low <= high){
        //     int mid = low + (high - low)/2;
        //     if(nums[mid] == target){
        //         return true;
        //     }
        //     else if(nums[mid] < target){
        //         low = mid + 1;
        //     }else{
        //         high = mid - 1;
        //     }
        // }
        // return false;

        //optimized 
        int n = nums.length; 
        int low = 0; 
        int high = n-1; 
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                return true;
            }
            if(nums[low] == nums[mid] && nums[mid] == nums[high]){
                low = low+1;
                high = high-1;
                continue;
            }
            if(nums[low]<= nums[mid]){ // check first half is sorted 
                if(nums[low]<= target && target <= nums[mid]){
                    high = mid - 1; // remove second half, target in first half
                }else{
                    low = mid + 1; // remove first half, target is second half
                }
            }else{ // check second half is sorted
                if(nums[mid]<= target && target <= nums[high]){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }
        }
        return false;
    }
}