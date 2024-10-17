package org.javadsa.demos.gfgpractice.easy;

public class FibonacciSeriesUsingRecursion {

    static int Fib(int N) {
        if (N == 0 || N == 1)
            return N;

        return Fib(N - 1) + Fib(N - 2);
    }

    public static void main(String[] args) {
        // Fibonacci of 3
        System.out.println("Fibonacci of " + 3 + " is " + Fib(3));

        // Fibonacci of 4
        System.out.println("Fibonacci of " + 4 + " is " + Fib(4));

        // Fibonacci of 5
        System.out.println("Fibonacci of " + 5 + " is " + Fib(5));
    }
}
