package Sort;

public class SimpleSort {

    public int[] sort(int[] values) {
        int valuesLength = values.length;
        int[] orderedValues = new int[valuesLength];

        for (int i = 0; i < valuesLength; i++) {
            int indexOfLowestValue = findIndexOfLowestValue(values);
            orderedValues[i] = values[indexOfLowestValue];
            values = dropValueByIndex(values, indexOfLowestValue);
        }

        return orderedValues;
    }

    private int findIndexOfLowestValue(int[] values) {
        int indexLowestValue = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[indexLowestValue] >= values[i]) {
                indexLowestValue = i;
            }
        }
        return indexLowestValue;
    }

    private int[] dropValueByIndex(int[] values, int indexOfLowestValue) {
        int[] newValues = new int[values.length - 1];
        boolean minusOne = false;
        for (int i = 0; i < values.length; i++) {
            if (indexOfLowestValue == i) {
                minusOne = true;
                continue;
            }
            if (minusOne) {
                newValues[i - 1] = values[i];
            } else {
                newValues[i] = values[i];
            }
        }
        return newValues;
    }
}
