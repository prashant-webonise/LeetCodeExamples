/**
 * Reverse digits of an integer.
 */
public class ReverseInteger {
    public static void main(String[] args) {
        int reverse = reverse(1000000003);
        System.out.println(reverse);
    }

    public static int reverse(int x) {
        try {
            int sign = x > 0 ? 1 : -1;

            String num = "";
            while (x != 0) {
                num += String.valueOf(Math.abs(x % 10));
                x = x / 10;
            }
            return Integer.parseInt(num) * sign;
        } catch (Exception exp) {
            exp.printStackTrace();
            return 0;
        }
    }
}
