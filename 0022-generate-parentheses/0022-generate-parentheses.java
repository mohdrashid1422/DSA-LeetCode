class Solution {
    public List<String> generateParenthesis(int n) {
        String curr = "";
        solve(curr, n);
        return result;
        
        
    }
    ArrayList<String> result = new ArrayList<>();
    public void solve(String curr, int n){
        if(curr.length() == 2*n){
            if(isValid(curr)){
                result.add(curr);
            }
            return;
        }
        curr = curr + "(";
        solve(curr, n);
        curr = curr.substring(0, curr.length() - 1);

        curr = curr + ")";
        solve(curr, n);
        
    }
    public boolean isValid(String str){
        int count = 0; 
        for(char i=0; i<str.length(); i++){
            if(str.charAt(i) == '('){
                count++;
            }else{
                count--;
            }
            if(count < 0){
                return false;
            }
        }
        return count == 0;
    }

}