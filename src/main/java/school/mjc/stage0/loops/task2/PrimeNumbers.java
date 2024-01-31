package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimesUpTo(int upperLimit) {
        for (int num = 2; num <= upperLimit; num++) {
            if (isPrime(num)) {
                System.out.println(num);
            }
        }
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.printPrimesUpTo(20);
    }
}
