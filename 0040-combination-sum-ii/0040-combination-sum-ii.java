class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        solve(candidates, 0, temp, target, result);

        return result;
    }
    public void solve(int [] candidates, int idx, List<Integer> temp, int target, List<List<Integer>> result){
        //base case
        if(target == 0){ // if target = 0 add combination which is equal to target
            result.add(new ArrayList<>(temp));
            return;
        }
        if(idx >= candidates.length || target < 0){ // if target is -ve
            return;
        } 
        
        temp.add(candidates[idx]);
        solve(candidates, idx+1, temp, target-candidates[idx], result); // single inclusion 
        temp.remove(temp.size()-1); // backtracking 
        int i = idx+1; // remove duplicates element 
        while(i<candidates.length && candidates[i] == candidates[idx]){
            i++;
        }
        solve(candidates, i, temp, target, result); // exclusion 
    }
}