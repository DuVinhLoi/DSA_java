public class TestBracketChecker {
    public static void main(String[] args) {
        String code1 = "{[()]}"; // true
        String code2 = "{[()]"; // false
        String code3 = "{[(]}"; // false
        System.out.println(BracketChecker.isBalanced(code1));
        System.out.println(BracketChecker.isBalanced(code2));
        System.out.println(BracketChecker.isBalanced(code3));
    }
}
