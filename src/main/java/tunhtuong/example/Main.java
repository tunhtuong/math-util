package tunhtuong.example;

import tunhtuong.example.core.MathUtil;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
            testFactorialGivenValid5RunWells();

        }
        public static void testFactorialGivenValid5RunWells(){
        int n = 5;
        long expectedValue =120;
        long actualValue = MathUtil.getFactorial;
            System.out.println("5! = ");
            System.out.println("Expected: " + expectedValue);
            System.out.println("Actual: " + actualValue);
    }
    public static void testFactorialGivenValid6RunWells(){
        int n = 6;
        long expectedValue =720;
        long actualValue = MathUtil.getFactorial;
        System.out.println("6! = ");
        System.out.println("Expected: " + expectedValue);
        System.out.println("Actual: " + actualValue);
    }
}
