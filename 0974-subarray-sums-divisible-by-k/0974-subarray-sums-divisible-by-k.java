class Solution {
    public int subarraysDivByK(int[] nums, int k) {

        // O(n^2)
        // int count = 0; 
        // for(int i=0; i<nums.length; i++){
        //     int sum = 0;
        //     for(int j=i; j<nums.length; j++){
        //         sum += nums[j];
        //         if((sum % k) == 0){
        //         count ++;
        //         }
        //     }
           
        // }
        // return count;

        int n = nums.length; 
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int result = 0; 
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += nums[i];
            int rem = sum % k;
            if(rem < 0){
                rem += k;
            }
            if(map.containsKey(rem)){
                result += map.get(rem);
            }
            map.put(rem, map.getOrDefault(rem,0)+1);
        }
        return result;
    }

    // decrease runtime of leetcode then use of Array instead of HashMap 
}