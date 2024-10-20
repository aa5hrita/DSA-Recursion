package org.javadsa.demos.gfgpractice.easy;

public class Print1toNUsingRecursion {
    static void printNumbers(int N) {
        if (N > 0) {
            printNumbers(N - 1);
            System.out.print(N + " ");
        }
    }

    static void printNumbers2(int N) {
        if (N == 0)
            return;
        printNumbers2(N - 1);
        System.out.print(N + " ");
    }

    public static void main(String[] args) {
        printNumbers(20);
        printNumbers2(20);
    }
}
