import java.util.Arrays;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String prefix = longestCommonPrefix("c","acc","ccc");
        System.out.println(prefix);
    }

    public static String longestCommonPrefix(String... strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        StringBuilder prefix = new StringBuilder();
        String str1 = strs[0];
        String str2;
        if (strs.length == 2) {
            str2 = strs[1];
        } else {
            String[] copyOfRange = Arrays.copyOfRange(strs, 1, strs.length);
            str2 = longestCommonPrefix(copyOfRange);
        }
        for (int k = 0; k < Math.min(str1.length(), str2.length()); k++) {
            if (str1.charAt(k) == str2.charAt(k)) {
                prefix.append(str1.charAt(k));
            } else {
                break;
            }
        }
        return prefix.toString();
    }
}