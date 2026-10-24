class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int low = 1; 
        int high = n-2;
        if(n==1){ // if only one element in an array
            return 0;
        }
        if(nums[0] > nums[1]){ // if first element is largest 
            return 0;
        }
        if(nums[n-1]> nums[n-2]){ // if last element is largest 
            return n-1;
        }
        while(low <= high){
            int mid = low + (high-low)/2;
            if((nums[mid-1] < nums[mid]) && nums[mid]>nums[mid+1]){ 
                return mid; // if peak is mid element 
            }else if(nums[mid-1] < nums[mid]){ // peak element is right side 
                low = mid+1;
            }else if(nums[mid] > nums[mid+1]){ // peak element is left side 
                high = mid -1;
            }else{
                low = mid + 1; // if above all condition is false peak is left or right side
            }
        }
        return -1;
    }
}