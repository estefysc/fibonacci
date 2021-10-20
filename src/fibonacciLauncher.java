/**
 * This class contains two methods that calculate an element, specified as an index number, of the Fibonacci series.
 * The first method calculates the element in a recursive manner while the second one calculates the element in an iterative manner.
 *
 * @author Estefania Sanchez
 * @version 1.0
 */
public class fibonacciLauncher {

    /**
     * Calculates a specific Fibonacci series element in a recursive manner.
     *
     * @param fibIndex
     * @return The number at the specified index in the Fibonacci series.
     */
    public static int fibonacciRecursive(int fibIndex) {
        if(fibIndex == 0) {
            return 0;
        } else if(fibIndex == 1) {
            return 1;
        } else {
            return fibonacciRecursive(fibIndex - 1) + fibonacciRecursive(fibIndex - 2);
        }
    } // End of fibonacciRecursive

    /**
     * Calculates a specific Fibonacci series element in an iterative manner.
     *
     * @param fibIndex
     * @return The number at the specified index in the Fibonacci series.
     */
    public static int fibonacciIterative(int fibIndex) {
        int firstFib = 0;
        int secondFib = 1;
        int thirdFib = 1;

        if(fibIndex == 0) {
            return firstFib;
        } else if(fibIndex == 1) {
            return secondFib;
        } else {
            for(int i = 0; (i + 2) < fibIndex; i++) {
                firstFib = secondFib;
                secondFib = thirdFib;
                thirdFib = firstFib + secondFib;
            }
            return thirdFib;
        } // End if/else
    } // End fibonacciIterative

    public static void main(String[] args) {
        int iterativeResult;
        int recursiveResult;

        long iterativeStartTime = System.nanoTime();
        iterativeResult = fibonacciIterative(10);
        long iterativeTotalTime = System.nanoTime() - iterativeStartTime;

        long recursiveStartTime = System.nanoTime();
        recursiveResult = fibonacciRecursive(10);
        long recursiveTotalTime = System.nanoTime() - recursiveStartTime;

        System.out.println("Iterative result = " + iterativeResult);
        System.out.println("The total time of execution for the iterative method is " + iterativeTotalTime + " nanoseconds.");
        System.out.println();

        System.out.println("Recursive result = " + recursiveResult);
        System.out.println("The total time of execution for the iterative method is " + recursiveTotalTime + " nanoseconds.");
    }
}
