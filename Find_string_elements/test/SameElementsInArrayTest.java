import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by admin on 29.10.15.
 */
public class SameElementsInArrayTest {

    @Test
    public void testCheckElements() throws Exception {
        String[] s = {"a", "b", "be","ce","de","ob","a"};
        boolean res = true;
        assertEquals(SameElementsInArray.checkElements(s),res);
    }
}