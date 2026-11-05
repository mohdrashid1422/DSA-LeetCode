class Solution {
    public void reverseString(char[] s) {
        // int low = 0; 
        // int high = s.length-1;
        // while(low <= high){
        //     char temp = s[low];
        //     s[low] = s[high];
        //     s[high] = temp;
        //     low++; 
        //     high--;
        // }
        int l = s.length;
        for(int i=0; i<l/2; i++){
            char temp = s[i];
            s[i] = s[l-i-1];
            s[l-i-1] = temp;
        }
    }
}