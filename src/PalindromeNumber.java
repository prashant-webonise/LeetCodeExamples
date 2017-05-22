/**
 * Determine whether an integer is a palindrome. Do this without extra space.
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        boolean palindrome = isPalindrome(2124554212);
        System.out.println(palindrome);
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int original = x;
        int rev = 0;
        while (x != 0) {
            rev = rev * 10 + x % 10;
            x = x / 10;
        }
        System.out.println(rev);
        return rev == original;
    }
}
