/**
 * Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.
 */
public class PlusOne {

    public static void main(String[] args) {

        int[] ints = plusOne(8,9,9,9);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i]);
        }
    }

    public static int[] plusOne(int... digits) {
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int digit = digits[i] + carry;
            if (digit <= 9) {
                digits[i] = digit;
                return digits;
            } else {
                digits[i] = 0;
                carry = 1;
            }
        }

        if (carry > 0) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = carry;
            System.arraycopy(digits, 0, newDigits, 1, digits.length);
            return newDigits;
        }
        return digits;
    }
}
