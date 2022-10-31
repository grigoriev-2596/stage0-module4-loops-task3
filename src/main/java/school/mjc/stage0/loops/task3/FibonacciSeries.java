package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int prevValue = 0;
        int nextValue = 1;
        int temp;
        for(int i = 0; i < lastFibonacci; i++) {
            System.out.println(prevValue);
            temp = nextValue + prevValue;
            prevValue = nextValue;
            nextValue = temp;
        }
    }
}
