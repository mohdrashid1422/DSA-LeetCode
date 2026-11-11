class Solution {
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        solve(nums, 0, temp, result);
        return result;

    }
    public void solve(int nums[], int idx, List<Integer> temp,List<List<Integer>> result){
        if(idx >= nums.length){ // base case 
            result.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[idx]); // inclusion current element
        solve(nums, idx+1, temp, result);
        temp.remove(temp.size()-1); // backtracking
        int i = idx+1; // skip duplicate element 
        while(i<nums.length && nums[i] == nums[idx]){
            i++;
        }
        solve(nums, i, temp, result); // exclusion current element
    }
}