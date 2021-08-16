package tasks.searchAlgorithms;

public class Utils {

    public static int linearSearch(double[] array, double value) {
        for(int i = 0; i < array.length; i++) {
            if (array[i] == value) return i;
        }
        return -1;
    }

}
