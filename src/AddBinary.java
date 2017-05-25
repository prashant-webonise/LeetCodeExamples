/**
 * Given two binary strings, return their sum (also a binary string).
 */
public class AddBinary {
    public static void main(String[] args) {
        String binary = addBinary("1111", "1111");
        System.out.println(binary);
    }

    public static String addBinary(String a, String b) {
        StringBuilder stringBuilder = new StringBuilder();
        if (a == null || a.isEmpty()) {
            return b;
        }
        if (b == null || b.isEmpty()) {
            return a;
        }

        int posA = a.length() - 1;
        int posB = b.length() - 1;
        boolean carry = false;

        while (posA >= 0 || posB >= 0) {
            char operand1 = posA >= 0 ? a.charAt(posA) : '0';
            char operand2 = posB >= 0 ? b.charAt(posB) : '0';

            if (operand1 != operand2) {
                if (carry) {
                    stringBuilder.insert(0, '0');
                } else {
                    carry = false;
                    stringBuilder.insert(0, '1');
                }
            } else if (operand1 == '0') {
                if (carry) {
                    stringBuilder.insert(0, '1');
                    carry = false;
                } else {
                    stringBuilder.insert(0, '0');
                }
            } else if (carry) {
                stringBuilder.insert(0, '1');
            } else {
                stringBuilder.insert(0, '0');
                carry = true;
            }

            posA--;
            posB--;
        }
        if (carry) {
            stringBuilder.insert(0, '1');
        }
        return stringBuilder.toString();
    }
}
