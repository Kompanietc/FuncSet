import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Компаниец on 17.10.2015.
 */
public class ArrayTest {

    @org.junit.Test
    public void testIntersection() throws Exception {
        double eps = 0.000001;
        double firstArray [] = {1,2,3,4,0,20.2233};//massive n
        double secondArray [] = {5,1,2,0,20.2234};//massive m
        double resualtArray [] = {1,2,0};
        Array.print(Array.intersection(firstArray,secondArray));
        assertArrayEquals(resualtArray, Array.intersection(firstArray, secondArray),eps);

    }
}