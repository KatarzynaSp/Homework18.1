import java.math.BigInteger;

class FibonacciSequenceCalc {
    static BigInteger sumOfEvenFibonacciValues(int limit) {
        int value1 = 0;
        int value2 = 1;
        BigInteger sum = BigInteger.ZERO;
        while (value2 < limit) {
            value2 += value1;
            if (value2 < 0) {
                return sum;
            }
            if (value2 % 2 == 0 && value2 < limit) {
                sum = sum.add(BigInteger.valueOf(value2));
            }
            value1 = value2 - value1;
        }
        return sum;
    }
}