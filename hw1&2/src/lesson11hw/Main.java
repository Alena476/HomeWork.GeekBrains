package lesson11hw;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Object[] arr = new Object[] {4, 5, 6};

        changeElementsInArray(new Object[] {4, 5, 6}, 0, 2 );

        changeElementsInArray2(new Integer[] {4, 5, 6}, 0, 2);
        changeElementsInArray2(new String[] {"a", "b", "c"}, 0, 2);
        changeElementsInArray2(new Double[] {4.0, 5.0, 6.1}, 0, 2);

        arrayToList(new Object[] {1, 2, 3});
    }

    public static void changeElementsInArray(Object[] array, int i, int j) {
        Object element = array[j];
        array[j] = array[i];
        array[i] = element;
        System.out.println(Arrays.asList(array));
    }

    public static <T> void  changeElementsInArray2(T[] array2, int i, int j) {
        T element = array2[j];
        array2[j] = array2[i];
        array2[i] = element;
        System.out.println(Arrays.asList(array2));
    }

    public static <T> List<T> arrayToList(T[] array) {
        System.out.println(Arrays.asList(array));
        return Arrays.asList(array);
    }
}