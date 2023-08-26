package exercise2_2;

import java.util.Comparator;

public class ArraySort {
    public static void sort(Object[] a,Comparator comparator) {
        for (int i = 0; i < a.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < a.length; j++) {
                if (comparator.compare(a[j],a[minPos]) == -1) {
                    minPos = j;
                }
            }

            Object temp = a[minPos];
            a[minPos] = a[i];
            a[i] = temp;
        }
    }
}
