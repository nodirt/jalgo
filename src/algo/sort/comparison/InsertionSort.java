package algo.sort.comparison;

public class InsertionSort<E> extends ComparisonSorting<E> {
    @Override
    public boolean isStable() {
        return true;
    }

    @Override
    public void sort(E[] array) {
        for (int i = 1; i < array.length; i++) {
            E elem = array[i];
            int j = i;
            while (j >= 1 && greater(array[j - 1], elem)) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = elem;
        }
    }
}
