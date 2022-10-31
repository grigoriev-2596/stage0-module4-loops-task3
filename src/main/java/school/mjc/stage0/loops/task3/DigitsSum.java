package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public static void printDigitsSum(int t){
        if (t < 0) t = -t;
        int sum = 0;
        for( ; t > 0;) {
            sum += t % 10;
            t /= 10;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        printDigitsSum(124124);
    }
}
