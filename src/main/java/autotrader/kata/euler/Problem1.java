package autotrader.kata.euler;

import java.util.stream.IntStream;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 * <p>
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Problem1 {
    public static void main(String[] args) {
        int upperLimit = 1000;
        int sum = IntStream.range(1, upperLimit).filter(i -> i % 3 == 0 || i % 5 == 0).sum();
        System.out.println(sum);
    }
}
