package java.com.ecse437project;

public class BinomialCoefficient implements Operation {

    public static int apply(int x, int y) {
        if (x < 0 || y < 0)
            throw new IllegalStateException("Can not do binomial coefficients with negative numbers");
        return factorial(x) / (factorial(y) * factorial(x-y));
    }

    private static int factorial(int n) {
        if (n == 0) return 1;

        return n * factorial(--n);
    }
}
