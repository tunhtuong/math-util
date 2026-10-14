package tunhtuong.example.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilTest {

    //test casse #1 120
    //test #4 n = -1!, expected =ham nem ra ngoai le dung asser khac
    @Test
    void testFactorialGivenValidN5ReturnWell120() {
        int n = 5;
        long expected = 120;
        long actual = MathUtil.getFactorial(n);

        //so sanh
        assertEquals(expected, actual);


    }
    @Test
    void testFactorialGivenValidN6ReturnWell120() {
        int n = 6;
        long expected = 720;
        long actual = MathUtil.getFactorial(n);

        assertEquals(expected, actual);


    }
    @Test
    void testFactorialGivenInValidN0ReturnWell120() {
        int n = 0;
        long expected = 1;
        long actual = MathUtil.getFactorial(n);

    }
    @Test
    void testFactorialGivenInValidNMinus1ThrowsException() {
        int invalidN = -1;
        //asserThrow( le xh ko , ham lamda co lenh goi ham code chinh)'
        assertThrows(IllegalArgumentException.class,
                () -> {
                    MathUtil.getFactorial(invalidN);
                       });
    }
}