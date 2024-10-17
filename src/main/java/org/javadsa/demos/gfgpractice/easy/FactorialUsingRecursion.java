package org.javadsa.demos.gfgpractice.easy;

//The factorial of a number N is the product of all the numbers between 1 and N.
public class FactorialUsingRecursion {
    static int factorial(int n) {
        int result;

        if (n == 1)
            return 1;
        result = factorial(n - 1) * n;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 3 is " + factorial(3));
        System.out.println("Factorial of 4 is " + factorial(4));
        System.out.println("Factorial of 5 is " + factorial(5));
    }

}
