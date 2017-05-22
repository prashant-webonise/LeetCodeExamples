import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 */
public class ValidParentheses {
    public static void main(String[] args) {
        boolean valid = isValid("]");
        System.out.println(valid);
    }

    public static boolean isValid(String s) {

        Stack<Character> characterStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                    characterStack.push('(');
                    break;
                case ')':
                    if (characterStack.empty() || characterStack.pop() != '(') {
                        return false;
                    }
                    break;
                case '[':
                    characterStack.push('[');
                    break;
                case ']':
                    if (characterStack.empty() || characterStack.pop() != '[') {
                        return false;
                    }
                    break;
                case '{':
                    characterStack.push('{');
                    break;
                case '}':
                    if (characterStack.empty() || characterStack.pop() != '{') {
                        return false;
                    }
                    break;
                default:
                    return false;
            }
        }
        return characterStack.empty();
    }
}
