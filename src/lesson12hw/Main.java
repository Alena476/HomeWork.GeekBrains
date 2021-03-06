package lesson12hw;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        final int SIZE = 10000000;
        final int HALF = SIZE / 2;
        float[] arr = new float[SIZE];

        arrayWithOnes(arr);

        SynchCountArrays countFormulaInArray = new SynchCountArrays();
        Thread act1 = new Thread(() -> {
            countFormulaInArray.fullArr(arr);
        });

        act1.start();
        act1.join();

        float[] arrNew = new float[SIZE];
        float[] halfOfArr = new float[HALF];
        arrayWithOnes(arrNew);

        long q = System.currentTimeMillis();
        System.arraycopy(arrNew, 0, halfOfArr, 0, HALF);
        SynchCountArrays countFormulaInHalvesArrays = new SynchCountArrays();
        Thread act2 = new Thread(() -> {
            countFormulaInHalvesArrays.countFormula(halfOfArr);
        });
        act2.start();
        act2.join();

        System.arraycopy(halfOfArr, 0, arrNew, 0, HALF);
        System.arraycopy(halfOfArr, 0, arrNew, HALF, HALF);
        System.out.println("Подсчет половинки массива: " + (System.currentTimeMillis() - q));

        System.out.println("finished");

    }
    public static void arrayWithOnes(float[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
    }
}
