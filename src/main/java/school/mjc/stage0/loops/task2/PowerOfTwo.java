package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int onePower = 0;

        while (onePower <= power) {
            System.out.println((int) Math.pow(2, onePower));
            onePower++;
        }
    }

    public static void main(String[] args) {
        PowerOfTwo powerOfTwo = new PowerOfTwo();
        powerOfTwo.printPower(5);
    }
}
