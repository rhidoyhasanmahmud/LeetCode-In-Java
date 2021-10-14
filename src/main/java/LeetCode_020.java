import java.util.Stack;

public class LeetCode_020 {
    public static void main(String[] args) {
        System.out.println(isValid("()(]{}"));
    }

    public static boolean isValid(String s) {
        Stack<Character> parenthesesStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{')
                parenthesesStack.push(ch);
            else {
                if (parenthesesStack.isEmpty())
                    return false;
                if (ch == ')') {
                    if ('(' != parenthesesStack.pop())
                        return false;
                } else if (ch == ']') {
                    if ('[' != parenthesesStack.pop())
                        return false;
                } else if (ch == '}') {
                    if ('{' != parenthesesStack.pop())
                        return false;
                }
            }
        }
        return parenthesesStack.empty();
    }
}
