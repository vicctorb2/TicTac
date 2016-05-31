package Statistic;

import java.util.Random;

/**
 * This class helps us to sort notation on java
 */
public class JavaSort {

    static Random rand = new Random();

    /**
     * quicksort
     *
     * @param begin border
     * @param end   border
     */
    public void qSort(Notation[] array, int begin, int end) {
        int i = begin;
        int j = end;
        int x = array[begin + rand.nextInt(end - begin + 1)].getButton();
        while (i <= j) {
            while (array[i].getButton() > x) {
                i++;
            }
            while (array[j].getButton() < x) {
                j--;
            }
            if (i <= j) {
                Notation temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (begin < j) {
            qSort(array, begin, j);
        }
        if (i < end) {
            qSort(array, i, end);
        }
    }
}