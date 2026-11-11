class Solution {
    private List<List<Integer>> result = new ArrayList<>();
    
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        solve(nums, 0, temp);
        return result;
    }

    private void solve(int[] nums, int idx, List<Integer> temp) {
        if (idx >= nums.length) { // base case 
            result.add(new ArrayList<>(temp)); 
            return;
        }

        temp.add(nums[idx]); // element ko choose kar rhe 
        solve(nums, idx + 1, temp); // trust kar rhe ki wo next element ko choose kar lega
        temp.remove(temp.size() - 1); //element ko choose nhi kar rhe 
        solve(nums, idx + 1, temp); //trust kar rhe ki wo next element ko choose kar lega
    
    }
    
}