public class LeetCode_1678 {
    public static void main(String[] args) {
        System.out.println(interpret("(al)G(al)()()G"));
    }

    public static String interpret(String command) {
        StringBuilder newCommand = new StringBuilder();
        int len = command.length();
        for (int i = 0; i < len; i++) {

            if (i != 0 && (command.charAt(i - 1) == '(' && command.charAt(i) == ')'))
                newCommand.append('o');
            if (command.charAt(i) == '(' || command.charAt(i) == ')')
                continue;
            else {
                newCommand.append(command.charAt(i));
            }
        }
        return newCommand.toString();
    }
}
