import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Тест, в котором в строке нет заданного символа
 */
public class CharNotFoundTest {

    @Test
    public void testCount() throws Exception {
        String str = "bbbbbb";
        char symb = 'a';
        int result = 0;

        assertEquals(result,CountSymbols.count(str,symb));
    }
}