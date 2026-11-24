class Solution {
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }

        int dp[] = new int[n+1];
        
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];

    //     int dp[] = new int[n+1];
    //     return dpfib(n, dp);
    }
    // public int dpfib(int n, int dp[]){
    //     if(n==0 || n==1){
    //         return n;
    //     }
    //     if(dp[n] != 0){
    //         return dp[n];
    //     }
    //     dp[n]=dpfib(n-1, dp)+dpfib(n-2, dp);
    //     return dp[n];
    // }
}