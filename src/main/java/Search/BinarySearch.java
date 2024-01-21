package Search;

import java.util.Arrays;

public class BinarySearch {

    public int search(int searchValue, int... orderedValues) {
        int minPosition = 0;
        int maxPosition = orderedValues.length - 1;

        while (minPosition <= maxPosition) {
            int middlePosition = minPosition + maxPosition / 2;
            int middleValue = orderedValues[middlePosition];
            if (searchValue == middleValue) {
                return middleValue;
            } else if (searchValue < middleValue) {
                maxPosition = middlePosition - 1;
            } else {
                minPosition = middlePosition + 1;
            }
        }
        throw new IllegalArgumentException("Illegal orderedValues");
    }

    public int searchWithDefaultImpl(int searchValue, int... orderedValues) {
        return orderedValues[Arrays.binarySearch(orderedValues, searchValue)];
    }
}
