class Solution {
    public int minSubarray(int[] nums, int p) {

        // O(n^2)
        // int n = nums.length; 
        // int totalSum = 0;
        // for(int i=0; i<n; i++){
        //     totalSum += nums[i];
            
        // }
        // int rem = totalSum % p;
        // if(rem == 0){
        //     return 0;
        // }
        // int minLen = n;
        // for(int i=0; i<nums.length; i++){
        //     int sum = 0;
        //     for(int j=i; j<nums.length; j++){
        //         sum += nums[j];
        //         if(sum % p == rem){
        //             minLen = Math.min(minLen, j-i+1);
        //         }
        //     }
        // }
        // return (minLen == n) ? -1 : minLen;
        

        // TC = O(n) and SC = O(n);
        int n = nums.length; 
        int totalSum = 0;
        // (a+b)%p = (a%p + b%p) % p
        for(int i=0; i<n; i++){
            totalSum = (totalSum+nums[i])%p;
        }
        int target = totalSum % p; 
        if(target == 0){ 
            return 0;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1); // currSum%p, index
        int curr = 0;
        int minLen = n;
        for(int j=0; j<n; j++){
            curr = (curr + nums[j])%p; // commulative sum 
            int remain = (curr-target + p)%p;
            if(map.containsKey(remain)){
                minLen = Math.min(minLen, j-map.get(remain));
            }
            map.put(curr, j);
        }
        return (minLen == n) ? -1 : minLen;
    }
}