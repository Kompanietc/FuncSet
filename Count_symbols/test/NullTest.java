import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Тест, в котором строка равна null
 */
public class NullTest {

    @Test
    public void testCount() throws Exception {
        String str = null;
        char symb = 'a';
        int result = 0;

        assertEquals(result,CountSymbols.count(str,symb));
    }
}