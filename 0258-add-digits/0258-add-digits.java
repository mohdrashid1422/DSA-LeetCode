class Solution {
    public int addDigits(int num) {
        // int onedigitno = num;
        // while(onedigitno >= 10){
        //     int rem = onedigitno % 10;
        //     int quot = onedigitno / 10; 
        //     onedigitno = rem + quot; 
        // }
        // return onedigitno;
        if(num == 0){
        return 0;
    }else if(num % 9 == 0) {
        return 9;
    }else{
        return num % 9;
    }
    }
    
    
}