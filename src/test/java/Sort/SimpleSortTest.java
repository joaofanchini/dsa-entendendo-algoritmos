package Sort;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SimpleSortTest {

    private final SimpleSort simpleSort = new SimpleSort();

    @Test
    @DisplayName("Test simple sort for ordered numbers")
    public void testSimpleSort() {
        final int[] values = new int[]{1, 493, 2932, 123, 34, 219, 12, 3};

        int[] orderedValues = simpleSort.sort(values);

        assert Arrays.equals(orderedValues, new int[]{1, 3, 12, 34, 123, 219, 493, 2932});
    }
}
