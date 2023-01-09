package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int result = 2;
        while (result <= printToInclusive) {
            int i = 2, count = 0;
            while (i <= result / 2) {
                if (result % i == 0) {
                    count++;
                    break;
                }
                i++;
            }
            if (count == 0) {
                System.out.println(result);
            }
            result++;
        }
    }
}
