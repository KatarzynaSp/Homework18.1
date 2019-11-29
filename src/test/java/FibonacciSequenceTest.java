import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciSequenceTest {
    private static FibonacciSequenceCalc fib;

    @BeforeEach
    void setUp() {
        fib = new FibonacciSequenceCalc();
    }

    @Test
    void whenLimitIs10_thenSumShouldBe10() {
//      given
        int limit = 10;
//      when
        BigInteger sum = fib.sumOfEvenFibonacciValues(limit);
//      then
        assertEquals(BigInteger.TEN, sum);
    }

    @Test
    void whenLimitIsMaxInt_thenSumShouldBeTrue() {
//      given
        int limit = 2147483647;
//      when
        BigInteger sum = fib.sumOfEvenFibonacciValues(limit);
//      then
        assertEquals(new BigInteger("1485607536"), sum, "Limit = maksymalny zakres wartości int");
    }

    @Test
    void whenLimitIs1NegativeNumber_thenSumShouldBeZero() {
//        given
        int limit = -5;
//        when
        BigInteger sum = fib.sumOfEvenFibonacciValues(limit);
//        then
        assertEquals(new BigInteger("0"), sum);

    }
    @Test
    void whenLimitIs5_thenSumShouldBe2() {
//        given
        int limit1 = 3;
        int limit2 = 5;
//        when
        boolean equals = fib.sumOfEvenFibonacciValues(limit1).equals(fib.sumOfEvenFibonacciValues(limit2));
//        then
        assertTrue(equals);
    }

}