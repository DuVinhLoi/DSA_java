public class StringReverseArrayStack {
    public static String reverseString(String input) {
        ArrayStack<Character> stack = new ArrayStack<Character>();

        // Đưa từng ký tự vào stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        StringBuilder reverse = new StringBuilder();
        while(!stack.isEmpty()){
            reverse.append(stack.pop());
        }

        return reverse.toString();
    }
}
