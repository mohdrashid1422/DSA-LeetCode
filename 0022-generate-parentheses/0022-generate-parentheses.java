class Solution {
    public List<String> generateParenthesis(int n) {
        String curr = "";
        int open = 0; 
        int close = 0;
        solve(curr, n, open, close);
        return result;
        
        
    }
    // ArrayList<String> result = new ArrayList<>();
    // public void solve(String curr, int n){
    //     if(curr.length() == 2*n){
    //         if(isValid(curr)){
    //             result.add(curr);
    //         }
    //         return;
    //     }
    //     curr = curr + "(";
    //     solve(curr, n);
    //     curr = curr.substring(0, curr.length() - 1);

    //     curr = curr + ")";
    //     solve(curr, n);
        
    // }
    // public boolean isValid(String str){
    //     int count = 0; 
    //     for(char i=0; i<str.length(); i++){
    //         if(str.charAt(i) == '('){
    //             count++;
    //         }else{
    //             count--;
    //         }
    //         if(count < 0){
    //             return false;
    //         }
    //     }
    //     return count == 0;
    // }

    ArrayList<String> result = new ArrayList<>();
    public void solve(String curr, int n, int open, int close){
        if(curr.length() == 2*n){
            result.add(curr);
            return;
        }
        if(open < n){
            curr = curr + "(";
            solve(curr, n, open+1, close);
            curr = curr.substring(0, curr.length() - 1);
        }
        
        if(close < open){
            curr = curr + ")";
            solve(curr, n, open, close+1);
            curr = curr.substring(0, curr.length() - 1);
        }
        
        
    }
}