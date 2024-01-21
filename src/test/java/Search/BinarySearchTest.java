package Search;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {

    private final BinarySearch binarySearch = new BinarySearch();

    @Test
    @DisplayName("test implementations of Binary Search")
    public void testImpl() {
        final int[] values = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        final int valueToSearch = 2;

        int searchedValue = binarySearch.search(valueToSearch, values);
        int searchedValueWithDefaultImpl = binarySearch.searchWithDefaultImpl(valueToSearch, values);

        assert searchedValue == valueToSearch;
        assert searchedValueWithDefaultImpl == valueToSearch;
    }
}
