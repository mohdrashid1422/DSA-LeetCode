
class Solution {
    public int[] findEvenNumbers(int[] digits) {
        
        TreeSet<Integer> set = new TreeSet<>();

        for(int i = 0; i < digits.length; i++) {
            for(int j = 0; j < digits.length; j++) {
                for(int k = 0; k < digits.length; k++) {

                    // All three indices must be different
                    if(i != j && j != k && i != k) {

                        // First digit cannot be 0
                        // Last digit must be even
                        if(digits[i] != 0 && digits[k] % 2 == 0) {

                            int num = digits[i] * 100
                                    + digits[j] * 10
                                    + digits[k];

                            set.add(num);
                        }
                    }
                }
            }
        }

        int ans[] = new int[set.size()];
        int index = 0;

        for(int num : set) {
            ans[index++] = num;
        }

        return ans;
    }
}
