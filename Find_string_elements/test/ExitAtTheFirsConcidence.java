import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Данный тест показывает то, что если обнаружено совпадение,
 * то программа выдает результат, не пробегаясь по оставшейся части массива
 */
public class ExitAtTheFirsConcidence {

    @Test
    public void testCheckSameElements() throws Exception {
        String[] s = {"a","a","b","a"};
        SameElementsInArray.print(s);
        boolean res = true;
        assertEquals(SameElementsInArray.checkSameElements(s),res);
    }
}