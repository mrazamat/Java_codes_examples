import java.math.BigInteger;

public class BigIntegerExample {
    // Returns Factorial of N
    static BigInteger factorial(int N) {
        // Initialize result
        BigInteger f = new BigInteger("1");

        // Multiply f with 2,3, ... N
        for (int i = 2; i <= N; i++) {
            f = f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }

    public static void main(String[] args) {
        int N = 100;
        System.out.println(factorial(N));
    }
}
