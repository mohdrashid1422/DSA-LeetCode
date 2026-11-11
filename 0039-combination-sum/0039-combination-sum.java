class Solution {
    Set<List<Integer>> set = new HashSet<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        solve(candidates, 0, temp, target, result);
        result.addAll(set);

        return result;
    }
    public void solve(int [] candidates, int idx, List<Integer> temp, int target, List<List<Integer>> result){
        //base case
        if(idx >= candidates.length || target < 0){ // if target is -ve
            return;
        } 
        if(target == 0){ // if target = 0 add combination which is equal to target
            set.add(new ArrayList<>(temp));
            return;
        }
        temp.add(candidates[idx]);
        solve(candidates, idx+1, temp, target-candidates[idx], result); // single inclusion 
        solve(candidates, idx, temp, target-candidates[idx], result); // multiple inclusion 
        temp.remove(temp.size()-1); // backtracking 
        solve(candidates, idx+1, temp, target, result); // exclusion 
    }
}