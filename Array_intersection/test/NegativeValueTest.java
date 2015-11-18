import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Компаниец on 18.11.2015.
 */
public class NegativeValueTest {

    @Test
    public void testIntersection() throws Exception {
        double eps = 0.000001;
        double firstArray [] = {-1,-2,-3};//massive n
        double secondArray [] = {-1,-2,0};//massive m
        double resualtArray [] = {-1,-2};
        Array.print(Array.intersection(firstArray,secondArray));
        assertArrayEquals(resualtArray, Array.intersection(firstArray, secondArray),eps);
    }
}