class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int m = g.length; // child
        int n = s.length; // cookies
        int i=0, j=0; 
        while(i < m && j < n){
            if(g[i] <= s[j]){ // cookies assign
                i++;
            }
            j++;
        }
        return i;


    }
}