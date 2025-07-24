package DSA.Recursion;

import java.util.Scanner;

/*
    Printing from N to 1 would mean that we are doing like 5, 4, 3, 2, 1. here it is first print(n) and then print(n-1).
    The above means that we do print(n) and let recursion handle everything, and this requires the recursive call being written at the bottom of the function. This is called as tail recursion.

    The opposite happens for printing 1 to N. Here we do 1,2,3,4,5. First we print(n-1) and then print(n). So first we mention the recursive call and then print. This is called head recursion.
*/
public class FindFactorial {

    public static void main(String[] args) {
        int n;
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        int result = getFactorial(n);
        System.out.println("fact of " + n + " is " + result);

        System.out.println("----------");

        System.out.println("printing numbers from " + n + " to 1");
        printNumbers(n);

        System.out.println("\n----------");

        int powResult = find2Power(n);
        System.out.println("pow of " + n + " is " + powResult);

        System.out.println("\n----------");

        int fibResult = fibonacciNo(n);
        System.out.println("fib of " + n + " is " + fibResult);

        System.out.println("\n----------");
        
        int sumResult = calcSumNto1(n);
        System.out.println("sum of " + n + " to 1 is " + sumResult);

    }

    // factorial of n
    private static int getFactorial(int n) {
        // base case
        if (n == 0 | n == 1) {
            return 1;
        }
        // recursive call
        return n * getFactorial(n - 1);
    }

    // find power 2 of n
    private static int find2Power(int n) {
        if (n == 0) {
            return 1;
        }
        return 2 * find2Power(n - 1);
    }

    // print n to 1
    private static void printNumbers(int n) {
        if (n == 0) return;
        System.out.print(n);
        printNumbers(n - 1);
    }

    // fibonacci series
    static int fibonacciNo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacciNo(n - 1) + fibonacciNo(n - 2);
    }

    // sum of elements from n to 1
    static int calcSumNto1(int n) {
        if (n == 0) {
            return 0;
        }
        return n + calcSumNto1(n - 1);
    }
}
