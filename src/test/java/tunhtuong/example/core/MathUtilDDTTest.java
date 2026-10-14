package tunhtuong.example.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilDDTTest {
        //hàm trả về mảng 2 chiều;
        // DDT DATA DRIVEN TESTING
    public static Object[][] initTestData(){
        Object[][] testData = {{0,1},
                                {1,1},
                                 {2,2},
                                  {5,120},
                                    {6,720}
        };
        return testData;
    }
    @ParameterizedTest
    @MethodSource("initTestData")
    void testFactorialGivenValidNRunWell(int n, long expected) throws Exception {
            assertEquals(expected,MathUtil.getFactorial(n));
    }
}