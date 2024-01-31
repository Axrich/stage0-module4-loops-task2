package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int i = 0;

        while (i <= printToInclusive) {
            long factorial = calculateFactorial(i);
            System.out.println("Factorial of " + i + ": " + factorial);
            i++;
        }
    }

    private long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            long result = 1;
            while (n > 1) {
                result *= n;
                n--;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        FactorialNumbers factorialNumbers = new FactorialNumbers();
        factorialNumbers.printFactorialRow(9);
    }
}
