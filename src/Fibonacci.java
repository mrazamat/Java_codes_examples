// Java program to compute n-th Fibonacci
// number where n may be large.

import java.math.BigInteger;

public class Fibonacci {
    // Returns n-th Fibonacci number
    static BigInteger fib(int n) {
        BigInteger a = BigInteger.valueOf(0);
        BigInteger b = BigInteger.valueOf(1);
        BigInteger c = BigInteger.valueOf(1);
        for (int j = 2; j <= n; j++) {
            c = a.add(b);
            a = b;
            b = c;
        }

        return (a);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci of " + n +
                "th term" + " " + "is" + " " + fib(n));
    }
}