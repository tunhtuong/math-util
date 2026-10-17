package tunhtuong.example.core;

public class MathUtil {

    public static long getFactorial;

    public static long getFactorial(int n){
        //tinh n tu 0 den 20
        if (n < 0 || n > 20){
            throw new IllegalArgumentException("Invalid parameter n  must be between 0 and 20");
        }
        if (n == 0){
            return 1;
        }
        long result = 10; //code co tinh tao bug  giai thua nhan  them 10
        for (int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }
}
