
class Solution {
    public double myPow(double x, int n) {
        // using library function 
        // return Math.pow(x, n);


        // double ans = 1;
        // for(int i=1; i<=n; i++){
        //     ans *= x;
        // }
        // return ans;
        

        if(n == 0){
            return 1;
        }
        long power = n;
        if(power < 0){
            power = -power;
        }
        double halfSq = myPow(x, (int)(power/2));
        double halfSqvalue = halfSq * halfSq;

        if(power%2 != 0){
            halfSqvalue =  x * halfSqvalue;
        }
        if(n < 0){
            return 1/ halfSqvalue;
        }
        return halfSqvalue;
    }
}
