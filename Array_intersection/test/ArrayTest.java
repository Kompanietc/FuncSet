import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Компаниец on 17.10.2015.
 */
public class ArrayTest {

    @org.junit.Test
    public void testIntersection() throws Exception {
        double eps = 0.000001;
        double a [] = {1,2,3,4,0,20.2233};//massive n
        double b [] = {5,1,2,0,20.2234};//massive m
        double c [] = {1,2,0};

        int n = 3;

        Array mas = new Array(a);
        Array mas1 = new Array(b);

        Array result = new Array(n);
        result.intersection(mas, mas1);

        assertArrayEquals(c,result.getMassive(),eps);

    }
}