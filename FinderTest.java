
    import org.junit.*;
    import static org.junit.Assert.assertEquals;


    public class FinderTest {
        private Finder _finder = new Finder();

        // Testing minimum array for an empty array
        @Test
        public void findMin_EmptyArray() {
            int[] emptyArray = new int[11];
            Integer expected = 0;
            Integer actual = _finder.findMin(emptyArray);
            assertEquals(expected, actual);
        }

        // Testing maximum array for an empty array
        @Test
        public void findMin_NullArray() {
            Integer actual = _finder.findMin(null);
            assertEquals(null, actual);
        }

        // Testing maximum array if null
        @Test
        public void findMax_NullArray() {
            Integer actual = _finder.findMax(null);
            assertEquals(null, actual);
        }

        // Testing if minimum array is valid
        @Test
        public void findMin_ValidArray() {
            int[] testArray = {1, 2, 3, 4, 5};
            Integer excepted = 1;
            Integer actual = _finder.findMin(testArray);

            assertEquals(excepted, actual);
        }

        // Testing maximum array is valid
        @Test
        public void findMax_ValidArray() {
            int[] testArray = {1, 2, 3, 4, 5};
            Integer expected = 5;
            Integer actual = _finder.findMax(testArray);

            assertEquals(expected, actual);
        }
    }
