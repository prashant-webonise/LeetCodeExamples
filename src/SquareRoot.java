/**
 * Implement int sqrt(int x).
 */
public class SquareRoot {
    public static void main(String[] args) {
        float sqrt = mySqrt(12);
        System.out.println(sqrt);
    }

    public static float mySqrt(float x) {
        int val1 = 1;
        while (val1 * val1 < x) {
            val1++;
        }
        val1--;

        float val4 = 0;
        do {
            float val2 = x / val1;
            float val3 = (val1 + val2) / 2;
            val4 = val3 * val3;
            System.out.println(val4);
        }
        while (val4 != x);
        return val4;
    }
}
