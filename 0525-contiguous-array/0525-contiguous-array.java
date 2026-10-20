class Solution {
    public int findMaxLength(int[] nums) {

        //O(n^2)
        // int n = nums.length; 
        // int maxLen = 0;
        // for(int i=0; i<n; i++){
        //     int zeros = 0, ones = 0; 
        //     for(int j=i; j<n; j++){
        //         if(nums[j] == 0){
        //             zeros++;
        //         }else{
        //             ones++;
        //         }
        //         if(zeros == ones){
        //             maxLen = Math.max(maxLen, j-i+1);
        //         }
        //     }
            
        // }
        // return maxLen;

        // similar question LC = 560
        // TC = O(n) and SC = O(n);
        int n = nums.length;
        // for(int i=0; i<n; i++){
        //     if(nums[i] == 0){
        //         nums[i] = -1;
        //     }
        // }
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);  
        int maxLen = 0; 
        int currsum = 0; 
        for(int i=0; i<n; i++){
            // jha zero wha -1 put kardo agar subarray sum karne par zero aa rha toh wo equal no of ones and zeros hai usme 
            currsum += (nums[i]==1)? 1 : -1;
            if(map.containsKey(currsum)){
                maxLen = Math.max(maxLen, i-map.get(currsum));
            }else{
                map.put(currsum, i);
            }
            // map.put(currsum, i);
        }
        return maxLen;
    }
}