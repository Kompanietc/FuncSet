import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Вариант, когда в массиве не имеется идентичных элементов
 */
public class SecondTest {

    @Test
    public void testCheckSameElements() throws Exception {
        String[] s = {"Vladmir", "want's", "excellent","mark"};
        SameElementsInArray.print(s);
        boolean res = false;
        assertEquals(SameElementsInArray.checkSameElements(s),res);
    }
}