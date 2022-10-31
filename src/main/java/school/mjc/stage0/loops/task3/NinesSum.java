package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        for(int i = 9; i < 10*lengthOfLastNumber; i = i * 10 + 9) {
            sum += i;
        }
        System.out.println(sum);
    }
}
