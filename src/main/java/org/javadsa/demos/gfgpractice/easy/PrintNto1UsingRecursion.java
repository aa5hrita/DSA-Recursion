package org.javadsa.demos.gfgpractice.easy;

public class PrintNto1UsingRecursion {
    static void printNumbers(int N) {
        if (N > 0)//The loop runs till N>1
        {
            System.out.print(N + " ");
            printNumbers(N - 1);
        }
    }

    static void printNumbers2(int N) {
        if (N == 0)
            return;
        System.out.print(N + " "); //print first and recursively call next smaller number
        printNumbers2(N - 1);
    }

    public static void main(String[] args) {
        printNumbers(20);
        printNumbers2(20);
    }
}
