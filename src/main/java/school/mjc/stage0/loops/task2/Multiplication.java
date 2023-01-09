package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int result = 0;
        if (multiplyByAndToInclusive > 0){
            while (result <= multiplyByAndToInclusive*multiplyByAndToInclusive){
                System.out.println(result);
                result += multiplyByAndToInclusive;
            }
        } else if (multiplyByAndToInclusive < 0){
            while (result >= multiplyByAndToInclusive*multiplyByAndToInclusive*-1){
                System.out.println(result);
                result += multiplyByAndToInclusive;
            }
        }
    }
}
