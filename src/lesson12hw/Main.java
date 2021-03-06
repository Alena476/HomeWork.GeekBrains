package lesson12hw;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        final int SIZE = 10000000;
        final int HALF = SIZE / 2;
        float[] arr = new float[SIZE];
        float[] arrNew = new float[SIZE];
        float[] arr1 = new float[HALF];

        arrayWithOnes(arr);
        CountArray countFormulaInArray = new CountArray();
        Thread act1 = new Thread(() -> {
            countFormulaInArray.fullArr(arr);
        });
        act1.start();

        arrayWithOnes(arrNew);
        time(arrNew, arr1, HALF);
    }

    public static void arrayWithOnes(float[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
    }

    public static void time(float[] arrNew, float[] arr1, int HALF) throws ExecutionException, InterruptedException {

        long q = System.currentTimeMillis();
        System.arraycopy(arrNew, 0, arr1, 0, HALF);

        ExecutorService serviceNew = Executors.newFixedThreadPool(2);

//        for(int j = 0; j < 2; j++) {
//                    serviceNew.submit(() -> {
////                     countFormula(arr1);
//
//return " result";
//            });
////                }
        for(int j = 0; j < 1; j++) {
            Future<?> future = serviceNew.submit(() -> {

                countFormula(arr1);

            });
            future.get();
        }

        System.arraycopy(arr1, 0, arrNew, 0, HALF);
        System.arraycopy(arr1, 0, arrNew, HALF, HALF);

        long result = System.currentTimeMillis() - q;

        System.out.println("Половинки массива: " + result);
        serviceNew.shutdown();
    }

    public static void countFormula(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
}
