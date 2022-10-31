package school.mjc.stage0.loops.task3;

public class NinesSum {
    public static void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        for(int i = 9; i < Math.pow(10,lengthOfLastNumber); i = i * 10 + 9) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        calculateSum(5);
    }
}
