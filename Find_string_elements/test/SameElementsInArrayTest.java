import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Простейший тест
 */
public class SameElementsInArrayTest {

    @Test
    public void testCheckElements() throws Exception {
        String[] s = {"a", "a"};
        SameElementsInArray.print(s);
        boolean res = true;
        assertEquals(SameElementsInArray.checkSameElements(s),res);
    }
}