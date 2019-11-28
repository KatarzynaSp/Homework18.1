import java.math.BigInteger;

public class FibonacciSequence {
    public static void main(String[] args) {
        System.out.println(sumOfEvenFibonacciValues(4000000));
    }

    public static BigInteger sumOfEvenFibonacciValues(int limit) {
        int number1 = 0;
        int number2 = 1;
        int result = 0;
        BigInteger sum = new BigInteger("0");
        for (int i = 0; result < limit; i++) {
            result = number1 + number2;
            if (result < 0) {
                return sum;
            }
            if (result % 2 == 0 && result < limit) {
                sum = sum.add(BigInteger.valueOf(result));
            }
            number1 = number2;
            number2 = result;
        }
        return sum;
    }
}