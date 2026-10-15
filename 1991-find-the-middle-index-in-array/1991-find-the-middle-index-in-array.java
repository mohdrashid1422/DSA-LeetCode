class Solution {
    public int findMiddleIndex(int[] nums) {
         int sum = 0; 
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
        }
        int left = 0; 
        int right = 0;
        for(int i=0; i<nums.length; i++){
            right = sum - (nums[i] + left); // suffix Sum
            if(left == right){
                return i;
            }
            left += nums[i]; // prefixSum, edge case example - 3
        }
        return -1;
    }
}