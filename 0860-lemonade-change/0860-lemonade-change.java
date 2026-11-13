class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0; 
        int ten = 0;
        for(int i=0; i<bills.length; i++){
            //$5
            if(bills[i] == 5){
                five++;
            }
            //%10
            else if(bills[i] == 10){
                ten++;
                if(five>0){
                    five--;
                }else{
                    return false;
                }
               
            }//$20
            else if(bills[i] == 20){
                if(five>0 && ten>0){
                //give one 10 and 1 five
                ten--;
                five--;
            }else if(five >=3){
                // give 3 five 
                five = five-3;
            }else{
                return false;
            }
            }
            
        }
        return true;
    }
}