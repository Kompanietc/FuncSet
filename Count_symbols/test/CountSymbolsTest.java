import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Простейший тест
 */
public class CountSymbolsTest {

    @Test
    public void testCountSymbols() throws Exception {
        String str = "a";
        char symb = 'a';
        int result = 1;

        assertEquals(result,CountSymbols.count(str,symb));

    }
}