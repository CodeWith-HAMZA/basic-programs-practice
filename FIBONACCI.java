//Using Recursion
public class FIBONACCI {
    public static int fibonacciRecursion(int n) {
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;
        return fibonacciRecursion(n - 2) + fibonacciRecursion(n - 1);
    }

    public static void main(String args[]) {
        int NUMBER_OF_TERMS = 10;
        System.out.print("Fibonacci Series of " + NUMBER_OF_TERMS + " numbers: ");
        for (int i = 0; i < NUMBER_OF_TERMS; i++)
            System.out.print(fibonacciRecursion(i) + " ");

    }
}
