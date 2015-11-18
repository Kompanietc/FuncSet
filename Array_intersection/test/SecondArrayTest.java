import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Больше знаков после запятой
 */
public class SecondArrayTest {

    @Test
    public void testIntersection() throws Exception {
        double eps = 0.000001;
        double firstArray [] = {1.001,1.777,1.888};//massive n
        double secondArray [] = {1.002,1.778,1.888};//massive m
        double resualtArray [] = {1.888};
        Array.print(Array.intersection(firstArray,secondArray));
        assertArrayEquals(resualtArray, Array.intersection(firstArray, secondArray),eps);
    }
}