
class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }

        long power = n;

        if (power < 0) {
            return 1.0 / myPowPositive(x, -power);
        }

        return myPowPositive(x, power);
    }

    private double myPowPositive(double x, long n) {
        if (n == 0) {
            return 1.0;
        }

        double half = myPowPositive(x, n / 2);

        double result = half * half;

        if (n % 2 == 1) {
            result *= x;
        }

        return result;
    }
}
