package gen;

public class Sorter {
    // Bubble sort implementation for integer and double arrays
    // What's wrong with a bibble sort? 
    //  For worst case is O(n^2), but so are many other simple sorts.
    //  For small arrays, it's often faster than more complex algorithms.
    //  It can be faster than O(n log n) sorts like quicksort or mergesort
    //  if the array is nearly sorted, because it can finish in O(n).
    //  It can be optimized to stop early if no swaps are made during a pass,
    //  making it adaptive to the initial order of elements.
    //  It is a stable sort, meaning that it preserves the relative order of equal elements.
    //  It is an in-place sort, requiring only a constant amount O(1) of additional memory space.
    public int[] sort(int[] array) {
        if (array == null) {
            return null;
        }
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public double[] sort(double[] array) {
        if (array == null) {
            return null;
        }
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // swap array[j] and array[j+1]
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public <T extends Comparable<T>> T[] sortWithGenerics(T[] array) {
        if (array == null) {
            return null;
        }
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    // swap array[j] and array[j+1]
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
 
            }
        }
        return array;
    }
}
