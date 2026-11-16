class Solution {
    public int addDigits(int num) {
        int onedigitno = num;
        while(onedigitno >= 10){
            int rem = onedigitno % 10;
            int quot = onedigitno / 10; 
            onedigitno = rem + quot; 
        }
        return onedigitno;
    }
}