/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 */
public class LengthofLastWord {
    public static void main(String[] args) {
        int lastWord = lengthOfLastWord("b   a    ");
        System.out.println(lastWord);
    }

    public static int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        s = s.trim();
        int lastIndexOf = s.lastIndexOf(' ');
        if (lastIndexOf == -1) {
            return s.length();
        }
        return Math.max((s.length() - 1) - lastIndexOf, 0);
    }
}
