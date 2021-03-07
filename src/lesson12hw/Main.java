package lesson12hw;

import java.util.Arrays;

public class Main {
    static final int SIZE = 10_000_000;
    static final int HALF = SIZE / 2;
    public static void main(String[] args) throws InterruptedException {
        countFullArray();
        countHalvesInArray();
    }

    public static void arrayWithOnes(float[] arr) {

//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = 1;
//        }
        Arrays.fill(arr, 1);
    }

    static public void countFormula(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (
                    arr[i]
                            * Math.sin(0.2f + i / 5)
                            * Math.cos(0.2f + i / 5)
                            * Math.cos(0.4f + i / 2)
            );
        }
    }

    public static void countFullArray() {
        float[] arr = new float[SIZE];
        arrayWithOnes(arr);
        long timeStart = System.currentTimeMillis();
        countFormula(arr);
        System.out.println(" FullArray time: " + (System.currentTimeMillis()-timeStart));
    }

    public static void countHalvesInArray() {
        float[] arrNew = new float[SIZE];

        arrayWithOnes(arrNew);
        long timeStart = System.currentTimeMillis();
        float[] halfOfArr1 = new float[HALF];
        float[] halfOfArr2 = new float[HALF];
        System.arraycopy(arrNew, 0, halfOfArr1, 0, HALF);
        System.arraycopy(arrNew, HALF, halfOfArr2, 0, HALF);

        Thread thread1 = new Thread(() -> countFormula(halfOfArr1));
        Thread thread2 = new Thread(()-> countFormula(halfOfArr2));

        thread1.start();
        thread2.start();

        joinThreads(thread1,thread2);

        System.arraycopy(halfOfArr1, 0, arrNew, 0, HALF);
        System.arraycopy(halfOfArr2, 0, arrNew, HALF, HALF);

        System.out.println("Подсчет половинки массива: " + (System.currentTimeMillis() - timeStart));
    }

    private static void joinThreads(Thread... threads) {
        try {
            for(Thread thread: threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
