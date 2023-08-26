package exercise1_2;

public class SortArray {
    public static void sort(Comparable[] objects) {
        for (int i = 0; i < objects.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < objects.length; j++) {
                if (objects[j].compareTo(objects[minPos]) == -1) {
                    minPos = j;
                }

            }
            Comparable temp = objects[minPos];
            objects[minPos] = objects[i];
            objects[i] = temp;
        }

    }
}
