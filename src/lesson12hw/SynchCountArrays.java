package lesson12hw;

public class SynchCountArrays {
    final int SIZE = 10000000;
    final int HALF = SIZE / 2;
    long b = 0;

    public synchronized void fullArr(float[] arr) {
        b = System.currentTimeMillis();
        countFormula(arr);
        System.out.println(" FullArray time: " + (System.currentTimeMillis()-b));
    }

    public void countFormula(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

}
