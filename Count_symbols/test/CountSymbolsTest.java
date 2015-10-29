import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by admin on 29.10.15.
 */
public class CountSymbolsTest {

    @Test
    public void testCountSymbols() throws Exception {
        String str = "aaaaaa";
        char symb = 'a';
        int _count = 6;

        assertEquals(_count,CountSymbols.count(str,symb));

    }
}