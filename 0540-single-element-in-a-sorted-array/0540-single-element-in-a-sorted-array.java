class Solution {
    public int singleNonDuplicate(int[] nums) {

        // brute force TC = O(n) and SC = O(n)
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i=0; i<nums.length; i++){
        //     int freq = nums[i];
        //     map.put(freq, map.getOrDefault(freq, 0)+1);
        // }
        // for(int key : map.keySet()){
        //     if(map.get(key) == 1){
        //         return key;
        //     }

        // }
        
        // return -1;

        int n = nums.length;
        int low=1; 
        int high=n-2;
        if(n==1){ // single element in an array
            return nums[0];
        }
        if(nums[0] != nums[1]){ // if 1st element not equal to 2nd
            return nums[0];
        }
        if(nums[n-1] != nums[n-2]){ // if last element not equal to 2nd last 
            return nums[n-1];
        }
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]){ // single ele.
                return nums[mid];
            }
            if((mid%2 == 1 && nums[mid] == nums[mid-1]) || //if mid is odd checkleft
               (mid%2 == 0 && nums[mid] == nums[mid+1])){ // if mid is even,,right  
                low = mid + 1; // single element in right half(eleminate left)
            }else{
                high = mid - 1; // single element in left half(eleminate right)
            }
        }
        return -1;

    }
}