package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int primeNumbersBeforePrintToInclusive = 0;
        while (primeNumbersBeforePrintToInclusive < printToInclusive) {
            primeNumbersBeforePrintToInclusive++;
            if (primeNumbersBeforePrintToInclusive % 1 == 0 && primeNumbersBeforePrintToInclusive % 2 == 0) {
            } else {
                System.out.println(primeNumbersBeforePrintToInclusive);
            }
        }
    }
}